package org.best_of_robotics.transform.orocos.to.cplusplus.wizard;

import java.util.ArrayList;

import org.best_of_robotics.transform.orocos.to.cplusplus.jobs.MergeRttModelOperationJob;
import org.eclipse.cdt.core.model.ICContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewMergedRttModel extends Wizard implements INewWizard {
	
	private IWorkbench workbench;
	private NewRttCompositeMainPage mainPage;
	private String location;
	
	public NewMergedRttModel() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		ISelection workbenchSelection = workbench.getActiveWorkbenchWindow().getSelectionService().getSelection();
		Object element = ((IStructuredSelection) workbenchSelection).getFirstElement();
		if (element instanceof IResource) {
			location = ((IResource) element).getLocation().toOSString();
		}
		if (element instanceof ICContainer) {
			IResource ccRes =((ICContainer) element).getResource();
			location = ccRes.getLocation().toOSString();
		}
        setWindowTitle("Window Title");
        setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		mainPage = new NewRttCompositeMainPage(workbench);
		addPage(mainPage);
	}

	@Override
	public boolean performFinish() {
		ArrayList<IResource> selectedResoources = mainPage.getSelectedResources();
		for (int index = 0; index < selectedResoources.size(); index++) {
			IResource leftResource = selectedResoources.get(index);
			IResource rightResource = selectedResoources.get(++index);
			
			MergeRttModelOperationJob mergeJob = new MergeRttModelOperationJob("Merge RTT Models");
			mergeJob.setLeftResource(leftResource);
			mergeJob.setRightResource(rightResource);
			mergeJob.setLocation(location);
			
			mergeJob.setUser(true);
			mergeJob.setPriority(Job.INTERACTIVE);
			mergeJob.setRule(null);
			mergeJob.schedule();
			
		}
		return true;
	}



}
