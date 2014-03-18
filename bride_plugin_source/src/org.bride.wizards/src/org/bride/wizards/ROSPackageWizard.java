package org.bride.wizards;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;

public class ROSPackageWizard extends Wizard implements INewWizard {
	
	private static final String WIZARD_NAME = "New ROS Package";
	private WizardNewProjectCreationPage _pageOne;

	public ROSPackageWizard() {
		// TODO Auto-generated constructor stub
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		String name = _pageOne.getProjectName();
		URI location = null;
		if (!_pageOne.useDefaults()) {
			location = _pageOne.getLocationURI();
		} // else location == null
		Assert.isNotNull(name);
        
		/*IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		
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
		}*/
		try {
			String cmd = "catkin_create_pkg --rosdistro groovy " + name;
			ProcessBuilder builder = new ProcessBuilder(cmd);
			Map<String, String> environ = builder.environment();
		    builder.directory(new File(location));
		    final Process process = builder.start();
	    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
	        public String queryOverwrite(String file) { return ALL; }
		};

		IProjectDescription description;
		try {
			description = ResourcesPlugin.getWorkspace().loadProjectDescription(  new Path("PROJECT_PATH/.project"));
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
			project.create(description, null);
			project.open(null);
			
			String baseDir = location.getPath();// location of files to import
			ImportOperation importOperation = new ImportOperation(project.getFullPath(), new File(baseDir), FileSystemStructureProvider.INSTANCE, overwriteQuery);
			importOperation.setCreateContainerStructure(false);
			importOperation.run(new NullProgressMonitor());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
