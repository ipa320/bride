package org.bride.wizards;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.dialogs.WizardImportPage;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;
import org.eclipse.jface.wizard.WizardPage;



public class ROSPackageImportWizard extends Wizard implements IImportWizard {

	private static final String WIZARD_NAME = "Import ROS Package";
	private ROSWizardResourceImportPage _pageOne;
	IStructuredSelection selection;
	
	public ROSPackageImportWizard() {
		// TODO Auto-generated constructor stub
		setWindowTitle(WIZARD_NAME);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		this.selection = selection;

	}

	@Override
	public boolean performFinish() {
		
		System.out.println(_pageOne.getCurrentPath());
		final File directory = new File(_pageOne.getCurrentPath());
		if(!directory.isDirectory())
		{
			return false;
		}
		
		System.out.println(directory.getName());
		File projectfile = new File(directory.getPath()+"/.project");
		if(projectfile.exists() && !projectfile.isDirectory())
		{
			System.out.println("Importing existing project");
		}
		else
		{
			Runtime run = Runtime.getRuntime();
			Process pr, pr2;
			try {
				pr = run.exec("rosrun bride eclipsefy_catkin_package.sh " + directory.getName(), null, new File(directory.getParent()));
				pr.waitFor();
				BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				String line = "";
				while ((line=buf.readLine())!=null) {
					System.out.println(line);
				}
				System.out.println("Finished creating eclipse project files");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(projectfile.exists() && !projectfile.isDirectory())
		{
			IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
		        public String queryOverwrite(String file) { return ALL; }
			};
			
			 
			WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
				protected void execute(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
							try {
								IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(  new Path(directory.getPath() +"/.project"));
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
		}
		else
		{
			MessageDialog
			.openError(
					PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell(),
					"Importing failed.",
					"Check if the Package you are importing is a valid catkin package and is within your current catkin workspaces.");
			return false;
		}
		return true;
	}
	
	@Override
	public void addPages() {
	    super.addPages();
	 
	    _pageOne = new ROSWizardResourceImportPage("Import ROS catkin projects into workspace", selection);
	    _pageOne.setTitle("ROS Import Wizard");
	    _pageOne.setDescription("Import ROS catkin projects into workspace");
	    
	    
	 
	    addPage(_pageOne);
	}

}
