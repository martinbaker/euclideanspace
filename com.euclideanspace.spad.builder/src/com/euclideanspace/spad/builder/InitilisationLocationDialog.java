/* Copyright 2012 Martin John Baker
 * 
 * This file is part of EuclideanSpace.
 *
 *  EuclideanSpace is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  EuclideanSpace is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with EuclideanSpace.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.euclideanspace.spad.builder;

import java.net.URI;
import java.net.URISyntaxException;
import org.eclipse.osgi.util.TextProcessor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Text;

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
	String labelText;
	String defaultPath;
	boolean enableBrowse;
	WizardNewSPADProjectPage1 callback;
	
	/**
	 * Create a new instance of a InitilisationLocationDialog.
	 * @param composite
	 * @param lt
	 * @param dp
	 * @param eb default value of enable browse button.
	 * @param callback.
	 */
	public InitilisationLocationDialog(Composite composite,
			  String lt,String dp,boolean eb,
			  WizardNewSPADProjectPage1 cb) {
		// If it is a new project always start enabled
		labelText = lt;
		defaultPath = dp;
		userPath = dp;
		enableBrowse = eb;
		callback = cb;
		createContents(composite);
	}

	/**
	 * Create the contents of the receiver.
	 * 
	 * @param composite
	 */
	private void createContents(Composite composite) {
		int columns = 4;
		//System.out.println("InitilisationLocationDialog.createContents");
		//System.out.println("labelText="+labelText);
		//System.out.println("defaultPath="+defaultPath);
		//System.out.println("enableBrowse="+enableBrowse);
		// project specification group
		Composite projectGroup = new Composite(composite, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = columns;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		useDefaultsButton = new Button(projectGroup, SWT.CHECK | SWT.RIGHT);
		useDefaultsButton.setText(labelText);
		useDefaultsButton.setSelection(enableBrowse);
		GridData buttonData = new GridData();
		buttonData.horizontalSpan = columns;
		useDefaultsButton.setLayoutData(buttonData);

		createUserEntryArea(projectGroup);

		useDefaultsButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				//System.out.println("InitilisationLocationDialog.widgetSelected");
				//boolean useDefaults = useDefaultsButton.getSelection();
				//System.out.println("InitilisationLocationDialog.widgetSelected useDefaults="+useDefaults);
				/*if (enableBrowse) {
					userPath = locationPathField.getText();
					//System.out.println("InitilisationLocationDialog.widgetSelected userPath="+userPath);
					locationPathField.setText(TextProcessor
							.process(defaultPath));
				} else {
					locationPathField.setText(TextProcessor.process(userPath));
					//System.out.println("InitilisationLocationDialog.widgetSelected locationPathField="+locationPathField);
				}*/
				enableBrowse = useDefaultsButton.getSelection();
				setUserAreaEnabled(enableBrowse);
			}
		});
		setUserAreaEnabled(enableBrowse);
	}

	/**
	 * Return whether or not we are currently showing the default location for
	 * the project.
	 * 
	 * @return boolean
	 */
/*	public boolean isDefault() {
		return useDefaultsButton.getSelection();
	}*/

	/**
	 * Create the area for user entry.
	 * 
	 * @param composite
	 * @param defaultEnabled
	 */
	private void createUserEntryArea(Composite composite) {
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
        locationPathField.setText(TextProcessor
          .process(defaultPath));
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
/*	private String getDefaultPathDisplayString() {
		return System.getProperty("user.home");
	}*/

	/**
	 * Set the enablement state of the receiver.
	 * 
	 * @param enabled
	 */
	private void setUserAreaEnabled(boolean enabled) {
		locationPathField.setEnabled(enabled);
		browseButton.setEnabled(enabled);
//		if (fileSystemSelectionArea != null) {
//			fileSystemSelectionArea.setEnabled(enabled);
//		}
	}
	
	/**
	 * The browse button has been pressed so open an appropriate directory
     * browser.
	 */
	private void handleLocationBrowseButtonPressed() {

		String selectedDirectory = null;
		String dirName = getPathFromLocationField();
		//System.out.println("InitilisationLocationDialog.handleLocationBrowseButtonPressed: "+
		DirectoryDialog dialog = new DirectoryDialog(
					locationPathField.getShell(), SWT.SHEET);
		dialog.setMessage("directory Label");
		dialog.setFilterPath(dirName);
		//System.out.println("InitilisationLocationDialog.handleLocationBrowseButtonPressed: "+
	    //        " setFilterPath="+dirName);

		selectedDirectory = dialog.open();

		userPath = selectedDirectory;

		if (selectedDirectory != null) {
			// update the text box
			updateLocationField(selectedDirectory);
			//getDialogSettings().put(SAVED_LOCATION_ATTR2, selectedDirectory);
		}
		callback.notifyChange();
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
			System.err.println("InitilisationLocationDialog.getProjectLocationURI: "+ e);
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
		try {
	  		//System.out.println("InitilisationLocationDialog.getProjectLocationURI: "+
	  		//		locationPathField.getText()+" URI="+new URI(locationPathField.getText()));
			 return new URI(locationPathField.getText());
		} catch (URISyntaxException e) {
			System.err.println("InitilisationLocationDialog.getProjectLocationURI: "+ e);
			return null;
		}
	}
	
	/**
	 * Get the String for the location field if possible.
	 * 
	 * @return String
	 */
	public String getProjectLocationString() {
	  	//System.out.println("InitilisationLocationDialog.getProjectLocationString: "+
	  	//	locationPathField.getText()+" String="+locationPathField.getText());
		return locationPathField.getText();
	}

}

