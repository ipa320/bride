package org.best_of_robotics.bride.cdt.ros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.envvar.IContributedEnvironment;
import org.eclipse.cdt.core.envvar.IEnvironmentVariable;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.ICConfigurationDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.WriteAccessException;
import org.eclipse.cdt.core.settings.model.extension.CConfigurationData;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;

public class ROSPackageProjectCreate extends Wizard implements INewWizard {
	
	private WizardNewProjectCreationPage _pageOne;


	public ROSPackageProjectCreate() {
		setWindowTitle("Create ROS Package Project");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		
		//Create new Project
		String name = _pageOne.getProjectName();
	    URI location = null;
	    if (!_pageOne.useDefaults()) {
	        location = _pageOne.getLocationURI();
	    } // else location == null
	    
	    
	    
	    IProject newProjectHandle = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
	    IProject project = null;
        if (!newProjectHandle.exists()) {
            URI projectLocation = location;
            IProjectDescription desc = newProjectHandle.getWorkspace().newProjectDescription(newProjectHandle.getName());
            if (location != null && ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location)) {
                projectLocation = null;
            }
 
            desc.setLocationURI(projectLocation);
            try {
                project = CCorePlugin.getDefault().createCDTProject(desc, newProjectHandle, new NullProgressMonitor());
                if (!newProjectHandle.isOpen()) {
                	newProjectHandle.open(null);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        
        ICProjectDescriptionManager mngr = CoreModel.getDefault().getProjectDescriptionManager();
		ICProjectDescription des;
		try {
			des = mngr.createProjectDescription(project, false);
			ManagedProject mProj = new ManagedProject(des);
	
			Configuration cfg = new Configuration(mProj, null, "ros.configuration.id", "ROSConfiguration");
			cfg.setBuildCommand("rosmake");
	
			IBuilder bld = cfg.getEditableBuilder();
			
			//bld.setManagedBuildOn(false);
	
			CConfigurationData data = cfg.getConfigurationData();
			//Assert.assertNotNull(data);
			des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);
			
			mngr.setProjectDescription(project, des);
			

		} catch (WriteAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        //Add default folders
	    try 
	    {
	
            String[] paths = { "model" }; //$NON-NLS-1$ //$NON-NLS-2$
            for (String path : paths) {
                IFolder etcFolders = project.getFolder(path);
                if (!etcFolders.exists()) {
                	etcFolders.create(false, true, null);
                }
            }
        } catch (CoreException e) {
            e.printStackTrace();
            project = null;
        }
		return true;
	}
	@Override
	public void addPages() {
	    super.addPages();
	 
	    _pageOne = new WizardNewProjectCreationPage("From Scratch Project Wizard");
	    _pageOne.setTitle("From Scratch Project");
	    _pageOne.setDescription("Create something from scratch.");
	 
	    addPage(_pageOne);
	}

}
