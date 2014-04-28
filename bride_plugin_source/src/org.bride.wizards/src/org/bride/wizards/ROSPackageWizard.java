package org.bride.wizards;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.IWorkingSetManager;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;
import org.eclipse.ui.internal.wizards.datatransfer.WizardProjectsImportPage.ProjectRecord;
import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

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
	
	public static void delete(File file) throws IOException{
    	if(file.isDirectory()){
    		//directory is empty, then delete it
    		if(file.list().length==0){
    		   file.delete();
    		   System.out.println("Directory is deleted : " + file.getAbsolutePath());
 
    		}else{
 
    		   //list all the directory contents
        	   String files[] = file.list();
 
        	   for (String temp : files) {
        	      //construct the file structure
        	      File fileDelete = new File(file, temp);
        	      //recursive delete
        	     delete(fileDelete);
        	   }
 
        	   //check the directory again, if empty then delete it
        	   if(file.list().length==0){
           	     file.delete();
        	     System.out.println("Directory is deleted : " + file.getAbsolutePath());
        	   }
    		}
 
    	}else{
    		//if file, then delete it
    		file.delete();
    		System.out.println("File is deleted : " + file.getAbsolutePath());
    	}
    }

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		String name = _pageOne.getProjectName();
		final URI location = _pageOne.getLocationURI();
		
		Assert.isNotNull(name);
        
		//setup project using catkin
		File directory = new File(location.getPath());
	
		System.out.println("Path: " + directory.getParent().toString());
		Runtime run = Runtime.getRuntime();
		Process pr, pr2;
		try {
			pr = run.exec("rosrun bride catkin_create_eclipse_package.sh " + name, null, new File(directory.getParent()));
			pr.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line = "";
			while ((line=buf.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println("Finished catkin_create_pkg");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//import project into workspace and change name from strange naming to actual project name
		
		IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
	        public String queryOverwrite(String file) { return ALL; }
		};
		 
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			protected void execute(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
						try {
							IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(  new Path(location.getPath() +"/.project"));
							String projectName = description.getName().split("@")[0];
							final IWorkspace workspace = ResourcesPlugin.getWorkspace();
							final IProject project = workspace.getRoot().getProject(projectName);
							description.setName(projectName);
							
							monitor.beginTask(DataTransferMessages.WizardProjectsImportPage_CreateProjectsTask,	100);
							project.create(description, new SubProgressMonitor(monitor, 30));
							project.open(IResource.BACKGROUND_REFRESH, new SubProgressMonitor(monitor, 70));
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			}
			};
		
			// run the new project creation operation
			try {
				getContainer().run(true, true, op);
			} catch (InterruptedException e) {
				return false;
			} catch (InvocationTargetException e) {
				// one of the steps resulted in a core exception
				Throwable t = e.getTargetException();
				String message = DataTransferMessages.WizardExternalProjectImportPage_errorMessage;
				IStatus status;
				if (t instanceof CoreException) {
					status = ((CoreException) t).getStatus();
				} else {
					status = new Status(IStatus.ERROR,
							IDEWorkbenchPlugin.IDE_WORKBENCH, 1, message, t);
				}
				ErrorDialog.openError(getShell(), message, null, status);
				return false;
			}

			
			/*description.setName(description.getName().split("@")[0]);
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
			System.out.println(project.getFullPath());
			
			String baseDir = location.getPath();// location of files to import
			ImportOperation importOperation = new ImportOperation(project.getFullPath(), new File(baseDir), FileSystemStructureProvider.INSTANCE, overwriteQuery);
			importOperation.setCreateContainerStructure(false);
			importOperation.run(new NullProgressMonitor());*/
		
		
        	
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
