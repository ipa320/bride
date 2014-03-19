package org.bride.wizards;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
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
		URI location = null;
		location = _pageOne.getLocationURI();
		
		Assert.isNotNull(name);
        
		//setup project using catkin
		File directory = new File(location.getPath());
	
		System.out.println("Path: " + directory.getParent().toString());
		Runtime run = Runtime.getRuntime();
		Process pr, pr2;
		try {
			pr = run.exec("catkin_create_pkg " + name, null, new File(directory.getParent()));
			pr.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line = "";
			while ((line=buf.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println("Finished catkin_create_pkg");
			
			File bride_dir = new File(directory+"/bride");
			try{
				bride_dir.mkdir();
			} catch(Exception e){
			    e.printStackTrace();
			}
			
			File model_dir = new File(directory+"/model");
			try{
				model_dir.mkdir();
			} catch(Exception e){
			    e.printStackTrace();
			}
			System.out.println("Subfolder created");
			
			pr2 = run.exec(new String[]{"cmake", "-DCMAKE_ECLIPSE_MAKE_ARGUMENTS=-j8", "-G", "Eclipse CDT4 - Unix Makefiles", ".."}, null, bride_dir);
			pr2.waitFor();
			String line2 = "";
			BufferedReader buf2 = new BufferedReader(new InputStreamReader(pr2.getErrorStream()));
			while ((line2=buf2.readLine())!=null) {
				System.out.println(line2);
			}
			pr2 = run.exec(new String[]{"cmake", "-DCMAKE_ECLIPSE_MAKE_ARGUMENTS=-j8", "-DCMAKE_MAKE_PROGRAM=catmake" , "-G", "Eclipse CDT4 - Unix Makefiles", ".."}, null, bride_dir);
			pr2.waitFor();
			System.out.println("Finished eclipse file generation");
			
			File projectfile = new File(bride_dir.getPath()+"/.project");
			projectfile.renameTo(new File(directory.getPath()+"/.project"));
			
			File cprojectfile = new File(bride_dir.getPath()+"/.cproject");
			cprojectfile.renameTo(new File(directory.getPath()+"/.cproject"));
			
			delete(bride_dir);
			
			System.out.println("Files moved");
			
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
		 
		IProjectDescription description;
		try {
			description = ResourcesPlugin.getWorkspace().loadProjectDescription(  new Path(location.getPath() +"/.project"));
			description.setName(description.getName().split("@")[0]);
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
			System.out.println(project.getFullPath());
			
			String baseDir = location.getPath();// location of files to import
			ImportOperation importOperation = new ImportOperation(project.getFullPath(), new File(baseDir), FileSystemStructureProvider.INSTANCE, overwriteQuery);
			importOperation.setCreateContainerStructure(false);
			importOperation.setCreateLinks(true);
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
