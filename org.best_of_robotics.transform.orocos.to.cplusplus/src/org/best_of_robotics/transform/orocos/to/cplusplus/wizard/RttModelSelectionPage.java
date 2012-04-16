package org.best_of_robotics.transform.orocos.to.cplusplus.wizard;

import java.util.ArrayList;
import java.util.LinkedList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;

public class RttModelSelectionPage extends WizardPage {

	private ListViewer listViewer;
	private ArrayList<IResource> rttFileList;

	public RttModelSelectionPage(String pageName) {
		super(pageName);
	}

	public RttModelSelectionPage(String pageName, String title,
			ImageDescriptor titleImage) {
		super(pageName, title, titleImage);
	}

	public RttModelSelectionPage(IWorkbench workbench) {
		super("RTT Model Selection");
	}
	
	public LinkedList<IResource> getSelectedResources() {
		LinkedList<IResource> selectedResource = new LinkedList<IResource>();
		//get the data given the string.
		String[] selections = listViewer.getList().getSelection();
		for (String selection : selections) {
			for(IResource resource : rttFileList) {
				if (resource.getName().equals(selection)) {
					selectedResource.add(resource);
					break;
				}
			}
		}
		return selectedResource;
	}

	@Override
	public void createControl(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		top.setLayout(new GridLayout());
		top.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		createModelList(top);
		setErrorMessage(null);
		setMessage("Select one or more models to merge.");
		setControl(top);
		top.redraw();
	}

	private void createModelList(Composite top) {
		listViewer = new ListViewer(top);
		listViewer.getList().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		IResource[] deploymentFileList = getListOfRttFiles();
		
		listViewer.setContentProvider(new IStructuredContentProvider() {
			
			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}
			
			@Override
			public void dispose() {
			}
			
			@Override
			public Object[] getElements(Object inputElement) {
				return (Object[]) inputElement;
			}
		});
		
		listViewer.setLabelProvider(new LabelProvider() {

			@Override
			public String getText(Object element) {
				return ((IResource) element).getName(); 
			}});
		
		listViewer.setInput(deploymentFileList);
	}

	private IResource[] getListOfRttFiles() {
		rttFileList = new ArrayList<IResource>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		for(IProject project : root.getProjects()) {
			String natureId = "org.eclipse.cdt.core.ccnature";
			try {
				if (project.isNatureEnabled(natureId)) {
					IResource[] members = project.members();
					findRTTFile(rttFileList, members);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return rttFileList.toArray(new IResource[rttFileList.size()]);
	}

	private void findRTTFile(ArrayList<IResource> deploymentFileList,
			IResource[] members) {
		for (IResource resource : members) {
			if (resource.getType() == IResource.FOLDER)
				try {
					findRTTFile(deploymentFileList, ((IFolder) resource).members());
				} catch (CoreException e) {
					e.printStackTrace();
				}
			if (resource.getFileExtension() != null && resource.getFileExtension().equals("rtt")) {
				deploymentFileList.add(resource);
			}
		}
	}

}
