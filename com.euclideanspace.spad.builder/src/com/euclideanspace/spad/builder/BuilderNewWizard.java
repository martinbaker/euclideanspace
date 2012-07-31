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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import java.net.URI;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;

public class BuilderNewWizard extends Wizard implements INewWizard {
	
	private WizardNewSPADProjectPage1 _pageOne;
	private WizardNewSPADProjectPage2 _pageTwo;
	/**
	 * a reference to the project that we will create
	 */
	private IProject project;
	
	public BuilderNewWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("spad project");
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	/**
	 * finish button has been pressed so:
	 * create project
	 * create folders
	 * create files by translating from friCAS source
	 */
	@Override
	public boolean performFinish() {
	    String projectName = _pageOne.getProjectName();
	    URI location = null;
	    if (!_pageOne.useDefaults()) {
	        location = _pageOne.getLocationURI();
	    }
        Assert.isNotNull(projectName);
        Assert.isTrue(projectName.trim().length() > 0);
        // first create the project
        project = createBaseProject(projectName, location);
        // now populate project with folders and files
        IFolder srcFolder = null;
	    srcFolder = createFolder("src",null);
	    /*IFolder srcgenFolder =*/ createFolder("src-gen",null);
        String fricasFiles = _pageOne.getFriCASFiles();
		//System.out.println("BuilderNewWizard.performFinish: "+
        //        " fricasFiles="+fricasFiles);
        if (fricasFiles != null && !"".equals(fricasFiles)) {
          Translate t = new Translate();
    	  t.trans(srcFolder,fricasFiles,this);
        }
	    return true;
	}

    /**
     * adds wizard pages
     */
	@Override
	public void addPages() {
	  super.addPages();
	  _pageOne = new WizardNewSPADProjectPage1("Build SPAD Project Wizard");
	  _pageOne.setTitle("Build SPAD Project");
	  _pageOne.setDescription("1 - Set Project name and location of FriCAS code");
	  addPage(_pageOne);
	  _pageTwo = new WizardNewSPADProjectPage2("Build SPAD Project Wizard");
	  _pageTwo.setTitle("Build SPAD Project");
	  _pageTwo.setDescription("2 - Code Translation Options");
	  addPage(_pageTwo);
	}

	/**
	 * Create an empty project. We can add folders and files later
	 *
	 * @param location
	 * @param projectName
	 */
	private IProject createBaseProject(String projectName, URI location) {
	  IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
	  if (!newProject.exists()) {
	    URI projectLocation = location;
	    IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
	    if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
	      projectLocation = null;
	    }
	    desc.setLocationURI(projectLocation);
	    try {
	      newProject.create(desc, null);
	      if (!newProject.isOpen()) {
	        newProject.open(null);
	      }
	    } catch (CoreException e) {
	      e.printStackTrace();
	    }
	  }
      return newProject;
    }

	/**
	 * create a folder with a given name in the given parent folder
	 * @param name is name of folder to be created
	 * @param parent is folder which will contain folder to be created
	 * @return the created folder
	 */
    public IFolder createFolder(String name,IFolder parent) {
	  IFolder folder = null;
	  try {
	    if (parent == null) {
	        //String folderFullPath = project.getStringProperty(INewJavaClassDataModelProperties.SOURCE_FOLDER);
	    	//folder = project.getFolder(new Path(folderFullPath));
	    	folder = project.getFolder(name);
	    }
	    else folder = parent.getFolder(name);
	    if (!folder.exists()) {
	      folder.create(false,true, null);
	    }
/* I would like the option of creating eclipse 'source' folders. I don't
 * know how to do this. I think is needs some code like the following but
 * I don't understand it and it seems to require org.eclipse.jdt.core
 * which I don't have installed.
 */
/*	    IPackageFragmentRoot srcRoot = project.getPackageFragmentRoot(folder);
	    IClasspathEntry[] oldEntries = project.getRawClasspath();
	    IClasspathEntry[] newEntries = new IClasspathEntry[oldEntries.length + 1];
	    System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
	    newEntries[oldEntries.length] = JavaCore.newSourceEntry(srcRoot.getPath());
	    project.setRawClasspath(newEntries, null);*/
      } catch (CoreException e) {
	    e.printStackTrace();
	  }
	  return folder;
    }

    /**
     * return user selection for statement terminator option:
     * @return 0=new line, 1=semicolon
     */
	public int getStatementTerminatorOption() {
		return _pageTwo.getStatementTerminatorOption();
	}

    public int getMacroOption(){
		return _pageTwo.getMacroOption();
    }

    public int getBracketedOption(){
		return _pageTwo.getBracketedOption();
    }

    public int getEscapeOption(){
		return _pageTwo.getEscapeOption();
    }

    public int getUnderscoreOption(){
    	return _pageTwo.getUnderscoreOption();
    }

    public int getDocumentationOption(){
    	return _pageTwo.getDocumentationOption();
    }

	public void StartProgress(String fileName,int index) {
		_pageOne.StartProgress(fileName,index);
		_pageTwo.StartProgress(fileName,index);
	}
	
	public void UpdateProgress(String fileName,int index) {
		_pageOne.UpdateProgress(fileName,index);
		_pageTwo.UpdateProgress(fileName,index);
	}

}
