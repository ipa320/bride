package org.bride.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.jface.wizard.WizardPage;



public class ROSPackageImportWizard extends Wizard implements IImportWizard {

	private static final String WIZARD_NAME = "Import ROS Package";
	private WizardPage _pageOne;
	
	public ROSPackageImportWizard() {
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
		return false;
	}
	
	@Override
	public void addPages() {
	    super.addPages();
	 
	    //_pageOne = new WizardPage("From Scratch Project Wizard");
	    _pageOne.setTitle("From Scratch Project");
	    _pageOne.setDescription("Create something from scratch.");
	    
	    
	 
	    addPage(_pageOne);
	}

}
