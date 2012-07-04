package com.euclideanspace.spad.builder;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
//import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import java.net.URI;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
//import org.eclipse.core.runtime.IProgressMonitor;

//import customplugin.natures.ProjectNature;


public class BuilderNewWizard extends Wizard implements INewWizard {
	
	private WizardNewSPADProjectCreationPage _pageOne;

	public BuilderNewWizard() {
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
        IProject project = createBaseProject(projectName, location);
        // now populate project with folders and files
        IFolder srcFolder = null;
        try {
	      srcFolder = project.getFolder("src");
	      createFolder(srcFolder);
	      IFolder srcgenFolder = project.getFolder("src-gen");
	      createFolder(srcgenFolder);
	    } catch (CoreException e) {
	      e.printStackTrace();
	      project = null;
	    }
        String fricasFiles = _pageOne.getFriCASFiles();
		System.out.println("BuilderNewWizard.performFinish: "+
                " fricasFiles="+fricasFiles);

        Translate t = new Translate();
    	t.trans(srcFolder,fricasFiles);
	    return true;
	}

    /**
     * adds wizard pages
     */
	@Override
	public void addPages() {
	  super.addPages();
	  _pageOne = new WizardNewSPADProjectCreationPage("Build SPAD Project Wizard");
	  _pageOne.setTitle("Build SPAD Project");
	  _pageOne.setDescription("Create an SPAD Project");

	  addPage(_pageOne);
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

	    private void createFolder(IFolder folder) throws CoreException {
	        IContainer parent = folder.getParent();
	        if (parent instanceof IFolder) {
	            createFolder((IFolder) parent);
	        }
	        if (!folder.exists()) {
	            folder.create(false, true, null);
	        }
	    }


}
