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

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * InitilisationLocationDialog is a convenience class for area that handle entry
 * of locations using URIs.
 * 
 * 
 */
public class ComboBoxDialog {

	private static final int SIZING_TEXT_FIELD_WIDTH2 = 250;

    Label fromLabel;
	Combo combo1;
	int comboIndex=0;
	String[] options=null;
	
	/**
	 * Create a new instance of a InitilisationLocationDialog.
	 * 
	 * @param composite
	 * @param opt
	 */
	public ComboBoxDialog(Composite composite,String[] opt) {
		options=opt;
		createContents(composite);
	}

	/**
	 * Create the contents of the receiver.
	 * 
	 * @param composite
	 */
	private void createContents(Composite composite) {

		int columns = 2;
		Composite projectGroup = new Composite(composite, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = columns;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH2;
		data.verticalSpan = columns;

        fromLabel = new Label(projectGroup, SWT.NONE);
        
        fromLabel.setLayoutData(data);
        //fromLabel.setFont(parent.getFont());

		combo1 = new Combo(projectGroup,SWT.DROP_DOWN);
		boolean fstOpt = true;
		for(String s : options){
		  if (fstOpt) fromLabel.setText(s);
		  else combo1.add(s);
		  fstOpt = false;
		}
		combo1.select(comboIndex);
		combo1.setLayoutData(data);
		combo1.addSelectionListener(new SelectionAdapter() {
		  public void widgetSelected(SelectionEvent e) {
			  selectionNotifier();
		  }
		});
	}

    public void selectionNotifier(){
    	comboIndex=combo1.getSelectionIndex();
    	//System.out.println("ComboBoxDialog.selectionNotifier: "+i);
    }
    
    /**
     * return user selection for statement terminator option:
     * @return 0=new line, 1=semicolon
     */
    public int getSelectedIndex(){
    	return comboIndex;
    }
}

