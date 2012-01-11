package org.best_of_robotics.transform.orocos.to.cplusplus.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.progress.IProgressService;
import org.orocos.model.rtt.Package;
import org.orocos.model.rtt.RttFactory;
import org.orocos.model.rtt.diagram.edit.parts.PackageEditPart;
import org.orocos.model.rtt.diagram.part.Messages;
import org.orocos.model.rtt.diagram.part.RttCreationWizardPage;
import org.orocos.model.rtt.diagram.part.RttDiagramEditorPlugin;
import org.orocos.model.rtt.diagram.part.RttDiagramEditorUtil;
import org.orocos.model.rtt.diagram.part.RttNewDiagramFileWizard;

public class NewMergedRttModel extends Wizard implements INewWizard {

	private IWorkbench workbench;
	protected IStructuredSelection selection;
	protected RttCreationWizardPage domainModelFilePage;
	protected RttModelSelectionPage rttSelectionPage;
	private IFile modelFile;
	private URI modelFileURI;

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("Merge RTT Models");
		setDefaultPageImageDescriptor(RttDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewRttWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		rttSelectionPage = new RttModelSelectionPage("Here");
		addPage(rttSelectionPage);
		domainModelFilePage = new RttCreationWizardPage(
				"DomainModelFile", selection, "rtt");
		domainModelFilePage
				.setTitle(Messages.RttCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(Messages.RttCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	public boolean performFinish() {
		createDomainModel();
		mergeModels();
		openEditor();
		return true;
	}

	private void createDomainModel() {
		modelFile = domainModelFilePage.createNewFile();
		ResourceSet resourceSet = new ResourceSetImpl();
		modelFileURI = URI.createPlatformResourceURI(modelFile
				.getFullPath().toString(), true);
		Resource resource = resourceSet.createResource(modelFileURI);
		String value = modelFile.getName().substring(0, modelFile.getName().indexOf(modelFile.getFileExtension()) - 1);
		Package rttPackage = RttFactory.eINSTANCE.createPackage();
		rttPackage.setName(value);
		resource.getContents().add(rttPackage);
		try {
			resource.save(null);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}

	private void mergeModels() {
		LinkedList<IResource> selectedResources = rttSelectionPage
				.getSelectedResources();
		IProgressService progressService = workbench.getProgressService();
		MergeRttModelOperation mergeRtt = new MergeRttModelOperation(selectedResources, modelFile);
		try {
			progressService.runInUI(workbench.getProgressService(), mergeRtt, null);
		} catch (InvocationTargetException ite) {
			ite.printStackTrace();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}
	
	private void openEditor() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(modelFileURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			RttDiagramEditorPlugin.getInstance().logError(
					"Unable to load resource: " + modelFileURI, ex); //$NON-NLS-1$
		}
		if (diagramRoot == null) {
			MessageDialog.openError(getShell(),
					Messages.InitDiagramFile_ResourceErrorDialogTitle,
					Messages.InitDiagramFile_ResourceErrorDialogMessage);
			return;
		}
		Wizard wizard = new RttNewDiagramFileWizard(modelFileURI,
				diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle,
				PackageEditPart.MODEL_ID));
		RttDiagramEditorUtil.runWizard(getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
	}

}
