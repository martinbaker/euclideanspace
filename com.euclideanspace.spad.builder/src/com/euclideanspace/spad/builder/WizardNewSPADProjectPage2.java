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


import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.dialogs.WorkingSetGroup;
import org.eclipse.jface.wizard.ProgressMonitorPart;


    /**
     * Standard main page for a wizard that is creates a project resource.
     * <p>
     * This class is based on org.eclipse.ui.dialogs.WizardNewProjectCreationPage
     * </p>
     * <p>
     * Example usage:
     * <pre>
     * mainPage = new WizardNewSPADProjectCreationPage("basicNewProjectPage");
     * mainPage.setTitle("Project");
     * mainPage.setDescription("Create a new project resource.");
     * </pre>
     * </p>
     */
    public class WizardNewSPADProjectPage2 extends WizardPage {

        ProgressMonitorPart progressMonitorPart;
        Label fromLabel;
        //boolean enableFinish = false;
        
        /*private Listener nameModifyListener = new Listener() {
            public void handleEvent(Event e) {
                boolean valid = validatePage();
                setPageComplete(valid);
                    
            }
        };*/

    	private ComboBoxDialog comboBoxDialog;
    	private ComboBoxDialog comboBoxDialog2;
    	private ComboBoxDialog comboBoxDialog3;
    	private ComboBoxDialog comboBoxDialog4;
    	private ComboBoxDialog comboBoxDialog5;
    	private ComboBoxDialog comboBoxDialog6;

    	private WorkingSetGroup workingSetGroup;

        // constants
        //private static final int SIZING_TEXT_FIELD_WIDTH = 250;

        /**
         * Creates a new project creation wizard page.
         *
         * @param pageName the name of this page
         */
        public WizardNewSPADProjectPage2(String pageName) {
        	super(pageName);
    	    setPageComplete(false);
        }

    	/** (non-Javadoc)
         * Method declared on IDialogPage.
         */
        public void createControl(Composite parent) {
            Composite composite = new Composite(parent, SWT.NULL);
        

            initializeDialogUnits(parent);

//            PlatformUI.getWorkbench().getHelpSystem().setHelp(composite,
//                    IIDEHelpContextIds.NEW_PROJECT_WIZARD_PAGE);

            composite.setLayout(new GridLayout());
            composite.setLayoutData(new GridData(GridData.FILL_BOTH));
    		
            Label warningLabel = new Label(composite, SWT.NONE);
            warningLabel.setText("I suggest only experts change these values - otherwise just press 'Finish'");
            Label warningLabel2 = new Label(composite, SWT.NONE);
            warningLabel2.setText("");
    		String[] options1 = {"statement terminator:","new line","semicolon"};
    		comboBoxDialog = new ComboBoxDialog(composite,options1);
    		String[] options2 = {"macros:","substitute and comment out","no change","comment out"};
    		comboBoxDialog2 = new ComboBoxDialog(composite,options2);
    		String[] options3 = {"bracketed statements:","change to braces","no change"};
    		comboBoxDialog3 = new ComboBoxDialog(composite,options3);
    		String[] options4 = {"escape in string:","double '/'","no change"};
    		comboBoxDialog4 = new ComboBoxDialog(composite,options4);
    		String[] options5 = {"line ending '_':","concatinate lines and remove '_'","remove '_'","no change"};
    		comboBoxDialog5 = new ComboBoxDialog(composite,options5);
    		String[] options6 = {"documentation:","html","tex"};
    		comboBoxDialog6 = new ComboBoxDialog(composite,options6);

    		progressMonitorPart=
              new ProgressMonitorPart(composite,null);
    		progressMonitorPart.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    		progressMonitorPart.setFont(parent.getFont());
    		progressMonitorPart.setVisible(true);
    		
            fromLabel = new Label(composite, SWT.NONE);
            fromLabel.setText("                                                ");
            fromLabel.setFont(parent.getFont());
            setPageComplete(validatePage());
            // Show description on opening
            setErrorMessage(null);
            setMessage(null);
            setControl(composite);
            Dialog.applyDialogFont(composite);
        }
        
        /**
    	 * Create a working set group for this page. This method can only be called
    	 * once.
    	 * 
    	 * @param composite
    	 *            the composite in which to create the group
    	 * @param selection
    	 *            the current workbench selection
    	 * @param supportedWorkingSetTypes
    	 *            an array of working set type IDs that will restrict what types
    	 *            of working sets can be chosen in this group
    	 * @return the created group. If this method has been called previously the
    	 *         original group will be returned.
    	 * @since 3.4
    	 */
    	public WorkingSetGroup createWorkingSetGroup(Composite composite,
    			IStructuredSelection selection, String[] supportedWorkingSetTypes) {
    		if (workingSetGroup != null)
    			return workingSetGroup;
    		workingSetGroup = new WorkingSetGroup(composite, selection,
    				supportedWorkingSetTypes);
    		return workingSetGroup;
    	}
    	
    	public void StartProgress(String fileName,int index) {
    		if (!isCurrentPage()) return;
    		//System.out.println("WizardNewSPADProjectCreationPage.StartProgress: "+
    		//		fileName+":"+index);
    		progressMonitorPart.beginTask(fileName,index);
    	}
    	
    	public void UpdateProgress(String fileName,int index) {
    		if (!isCurrentPage()) return;
    		//System.out.println("WizardNewSPADProjectCreationPage.UpdateProgress: "+
    		//		fileName+":"+index);
    		progressMonitorPart.worked(1);
    		fromLabel.setText(fileName);
    	}

        /**
         * return user selection for statement terminator option:
         * @return 0=new line, 1=semicolon
         */
        public int getStatementTerminatorOption(){
        	if (comboBoxDialog == null) return 0;
        	return comboBoxDialog.getSelectedIndex();
        }

        public int getMacroOption(){
        	if (comboBoxDialog2 == null) return 0;
        	return comboBoxDialog2.getSelectedIndex();
        }

        public int getBracketedOption(){
        	if (comboBoxDialog3 == null) return 0;
        	return comboBoxDialog3.getSelectedIndex();
        }

        public int getEscapeOption(){
        	if (comboBoxDialog4 == null) return 0;
        	return comboBoxDialog4.getSelectedIndex();
        }

        public int getUnderscoreOption(){
        	if (comboBoxDialog5 == null) return 0;
        	return comboBoxDialog5.getSelectedIndex();
        }

        public int getDocumentationOption(){
        	if (comboBoxDialog6 == null) return 0;
        	return comboBoxDialog6.getSelectedIndex();
        }

        /**
         * Returns whether this page's controls currently all contain valid 
         * values.
         *
         * @return <code>true</code> if all controls are valid, and
         *   <code>false</code> if at least one is invalid
         */
        protected boolean validatePage() {
            //return isCurrentPage();
            return true;
        }

        /*
         * see @DialogPage.setVisible(boolean)
         */
        public void setVisible(boolean visible) {
            super.setVisible(visible);
        }

        /**
         * Returns the useDefaults.
         * @return boolean
         */
        public boolean useDefaults() {
            return true;
        }

        /**
    	 * Return the selected working sets, if any. If this page is not configured
    	 * to interact with working sets this will be an empty array.
    	 * 
    	 * @return the selected working sets
    	 * @since 3.4
    	 */
    	public IWorkingSet[] getSelectedWorkingSets() {
    		return workingSetGroup == null ? new IWorkingSet[0] : workingSetGroup
    				.getSelectedWorkingSets();
    	}
    }

