package com.euclideanspace.spad.builder;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.osgi.util.TextProcessor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.internal.ide.dialogs.FileSystemSelectionArea;
import org.eclipse.ui.internal.ide.filesystem.FileSystemConfiguration;
import org.eclipse.ui.internal.ide.filesystem.FileSystemSupportRegistry;


/**
 * InitilisationLocationDialog is a convenience class for area that handle entry
 * of locations using URIs.
 * 
 * 
 */
public class InitilisationLocationDialog {

	private static final int SIZING_TEXT_FIELD_WIDTH2 = 250;

	private Text locationPathField;

	private Button browseButton;

	private String userPath = "";

	private Button useDefaultsButton;

	private FileSystemSelectionArea fileSystemSelectionArea;

	/**
	 * Create a new instance of a InitilisationLocationDialog.
	 * 
	 * @param reporter
	 * @param composite
	 */
	public InitilisationLocationDialog(/*IErrorMessageReporter reporter,*/
			Composite composite) {
		// If it is a new project always start enabled
		createContents(composite, true);
	}

	/**
	 * Create the contents of the receiver.
	 * 
	 * @param composite
	 * @param defaultEnabled
	 */
	private void createContents(Composite composite, boolean defaultEnabled) {

		int columns = 4;
		// project specification group
		Composite projectGroup = new Composite(composite, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = columns;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		useDefaultsButton = new Button(projectGroup, SWT.CHECK | SWT.RIGHT);
		useDefaultsButton.setText("Initialise from FriCAS files");
		useDefaultsButton.setSelection(defaultEnabled);
		GridData buttonData = new GridData();
		buttonData.horizontalSpan = columns;
		useDefaultsButton.setLayoutData(buttonData);

		createUserEntryArea(projectGroup, defaultEnabled);

		useDefaultsButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				System.out.println("InitilisationLocationDialog.widgetSelected");
				boolean useDefaults = useDefaultsButton.getSelection();
				System.out.println("InitilisationLocationDialog.widgetSelected useDefaults="+useDefaults);

				if (useDefaults) {
					userPath = locationPathField.getText();
					System.out.println("InitilisationLocationDialog.widgetSelected userPath="+userPath);
					locationPathField.setText(TextProcessor
							.process(getDefaultPathDisplayString()));
				} else {
					locationPathField.setText(TextProcessor.process(userPath));
					System.out.println("InitilisationLocationDialog.widgetSelected locationPathField="+locationPathField);
				}
				setUserAreaEnabled(useDefaults);
			}
		});
		setUserAreaEnabled(defaultEnabled);
	}

	/**
	 * Return whether or not we are currently showing the default location for
	 * the project.
	 * 
	 * @return boolean
	 */
	public boolean isDefault() {
		return useDefaultsButton.getSelection();
	}

	/**
	 * Create the area for user entry.
	 * 
	 * @param composite
	 * @param defaultEnabled
	 */
	private void createUserEntryArea(Composite composite, boolean defaultEnabled) {
		// project location entry field
		locationPathField = new Text(composite, SWT.BORDER);
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH2;
		data.horizontalSpan = 2;
		locationPathField.setLayoutData(data);

		// browse button
		browseButton = new Button(composite, SWT.PUSH);
		browseButton.setText("Browse");
		browseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				handleLocationBrowseButtonPressed();
			}
		});

		if (defaultEnabled) {
			locationPathField.setText(TextProcessor
					.process(getDefaultPathDisplayString()));
		} else {
		  locationPathField.setText("");
		}

		locationPathField.addModifyListener(new ModifyListener() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				System.out.println("modifyText: "+
	                    locationPathField+ " e="+e);
				//errorReporter.reportError(checkValidLocation(), false);
			}
		});
	}

	public String getSelectedDirectoryPath(){
		return userPath;
	}
	
	/**
	 * Return the path we are going to display. If it is a file URI then remove
	 * the file prefix.
	 * 
	 * @return String
	 */
	private String getDefaultPathDisplayString() {
		return System.getProperty("user.home");
	}

	/**
	 * Set the enablement state of the receiver.
	 * 
	 * @param enabled
	 */
	private void setUserAreaEnabled(boolean enabled) {
		locationPathField.setEnabled(enabled);
		browseButton.setEnabled(enabled);
		if (fileSystemSelectionArea != null) {
			fileSystemSelectionArea.setEnabled(enabled);
		}
	}

	
	/**
	 * The browse button has been pressed so open an appropriate directory
     * browser.
	 */
	private void handleLocationBrowseButtonPressed() {

		String selectedDirectory = null;
		String dirName = getPathFromLocationField();
		//System.out.println("InitilisationLocationDialog.handleLocationBrowseButtonPressed: "+
        //        locationPathField+ " dirName="+dirName);


		FileSystemConfiguration config = getSelectedConfiguration();
		if (config== null || config.equals(
				FileSystemSupportRegistry.getInstance()
						.getDefaultConfiguration())) {
			DirectoryDialog dialog = new DirectoryDialog(
					locationPathField.getShell(), SWT.SHEET);
			dialog.setMessage("directory Label");
			dialog.setFilterPath(dirName);
			//System.out.println("InitilisationLocationDialog.handleLocationBrowseButtonPressed: "+
	        //        " setFilterPath="+dirName);

			selectedDirectory = dialog.open();

		} else {
			URI uri = getSelectedConfiguration().getContributor()
					.browseFileSystem(dirName, browseButton.getShell());
			//System.out.println("InitilisationLocationDialog.handleLocationBrowseButtonPressed: "+
	        //        " uri="+uri);
			if (uri != null)
				selectedDirectory = uri.toString();
		}
		userPath = selectedDirectory;

		if (selectedDirectory != null) {
			// update the text box
			updateLocationField(selectedDirectory);
			//getDialogSettings().put(SAVED_LOCATION_ATTR2, selectedDirectory);
		}
	}

	/**
	 * Update the location field based on the selected path.
	 * 
	 * @param selectedPath
	 */
	private void updateLocationField(String selectedPath) {
		locationPathField.setText(TextProcessor.process(selectedPath));
	}

	/**
	 * Return the path on the location field.
	 * 
	 * @return the path or the field's text if the path is invalid
	 */
	private String getPathFromLocationField() {
		URI fieldURI;
		try {
			fieldURI = new URI(locationPathField.getText());
		} catch (URISyntaxException e) {
			return locationPathField.getText();
		}
		String path= fieldURI.getPath();
		return path != null ? path : locationPathField.getText();
	}


	/**
	 * Get the URI for the location field if possible.
	 * 
	 * @return URI or <code>null</code> if it is not valid.
	 */
	public URI getProjectLocationURI() {

		FileSystemConfiguration configuration = getSelectedConfiguration();
		if (configuration == null) {
			return null;
		}

		return configuration.getContributor().getURI(
				locationPathField.getText());

	}

	/**
	 * Return the selected contributor
	 * 
	 * @return FileSystemConfiguration or <code>null</code> if it cannot be
	 *         determined.
	 */
	private FileSystemConfiguration getSelectedConfiguration() {
		if (fileSystemSelectionArea == null) {
			return FileSystemSupportRegistry.getInstance()
					.getDefaultConfiguration();
		}

		return fileSystemSelectionArea.getSelectedConfiguration();
	}

}

