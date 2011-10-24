package org.best_of_robotics.transform.orocos.to.cplusplus.jobs;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.best_of_robotics.transform.orocos.to.cplusplus.Activator;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.trace.MatchTrace;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eml.EmlModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.erl.ErlModule;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.progress.UIJob;
import org.orocos.model.rtt.RttFactory;
import org.orocos.model.rtt.RttPackage;
import org.orocos.model.rtt.diagram.edit.parts.PackageEditPart;
import org.orocos.model.rtt.diagram.part.Messages;
import org.orocos.model.rtt.diagram.part.RttDiagramEditorPlugin;
import org.orocos.model.rtt.diagram.part.RttDiagramEditorUtil;
import org.orocos.model.rtt.diagram.part.RttNewDiagramFileWizard;

public class MergeRttModelOperationJob extends UIJob {
	
	private String comparisonPath = "epsilon/rtt.ecl";
	private String mergePath = "epsilon/rttMerge.eml";
	private MatchTrace matchTrace;
	private String location;
	private ModelRepository modelRepository;
	private IResource leftResource;
	private IResource rightResource;
	private org.eclipse.emf.common.util.URI domainModelURI;
	protected Shell shell;

	public MergeRttModelOperationJob(String name) {
		super(name);
	}

	public void setLeftResource(IResource leftResource) {
		this.leftResource = leftResource;
	}

	public void setRightResource(IResource rightResource) {
		this.rightResource = rightResource;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public IStatus runInUIThread(IProgressMonitor monitor) {
		monitor.beginTask(getName(), 4);
		monitor.worked(1);
		doComparison();
		monitor.worked(1);
		doMerge();
		monitor.worked(1);
		openEditor();
		monitor.worked(1);
		return Status.OK_STATUS;
	}
	
	private URI createURIforTransformationFile(String transformPath) {
		URL transformationEntry = Activator.getDefault().getBundle()
				.getEntry(transformPath);
		URL resolvedTransformationURL = null;
		URI transformURI = null;
		try {
			resolvedTransformationURL = FileLocator
					.resolve(transformationEntry);
			transformURI = resolvedTransformationURL.toURI();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return transformURI;
	}
	
	private void doComparison() {
		URI transformURI = createURIforTransformationFile(comparisonPath);
		EclModule eclModule = new EclModule();
		try {
			eclModule.parse(transformURI);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		checkforParseErrors(eclModule);
		
		EmfModel leftModel = new EmfModel();
		leftModel.setName("Left");
		leftModel.getAliases().add("Source");
		leftModel.setMetamodelUri("http://rtt/1.0");
		leftModel.setModelFile(leftResource.getLocation().toOSString());
		leftModel.setReadOnLoad(true);
		leftModel.setStoredOnDisposal(false);
		try {
			leftModel.load();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		}
		
		EmfModel rightModel = new EmfModel();
		rightModel.setName("Right");
		rightModel.getAliases().add("Source");
		rightModel.setMetamodelUri("http://rtt/1.0");
		rightModel.setModelFile(rightResource.getLocation().toOSString());
		//emf resource not set
		rightModel.setReadOnLoad(true);
		rightModel.setStoredOnDisposal(false);
		try {
			rightModel.load();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		}
		
		eclModule.getContext().getModelRepository().addModel(leftModel);
		eclModule.getContext().getModelRepository().addModel(rightModel);
		
		try {
			eclModule.execute();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		
		matchTrace = eclModule.getContext().getMatchTrace().getReduced();
		modelRepository = eclModule.getContext().getModelRepository();
		
		eclModule.getContext().getExecutorFactory().getExecutionController().dispose();
	}

	private void checkforParseErrors(ErlModule erlModule) {
		if (erlModule.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : erlModule.getParseProblems()) {
				System.err.println(problem.toString());
			}
		}
	}
	
	private void doMerge() {
		URI transformURI = createURIforTransformationFile(mergePath);
		EmlModule emlModule = new EmlModule();
		try {
			emlModule.parse(transformURI);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		checkforParseErrors(emlModule);
		
		emlModule.getContext().setMatchTrace(matchTrace);
		emlModule.getContext().setModelRepository(modelRepository);
		emlModule.getContext().getModelRepository().addModel(createTarget());
		
		try {
			emlModule.execute();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		
		emlModule.getContext().getModelRepository().dispose();
		emlModule.getContext().getExecutorFactory().getExecutionController().dispose();
		
		try {
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	protected EmfModel createTarget() {
		
		String targetRttFile = location + "/mergedComponents.rtt";

		RttPackage rttPackage = RttFactory.eINSTANCE.getRttPackage();

		ResourceSet resourceSet = new ResourceSetImpl();
		org.eclipse.emf.common.util.URI rttFilelURI = org.eclipse.emf.common.util.URI
				.createFileURI(targetRttFile);
		domainModelURI = rttFilelURI;
		Resource resource = resourceSet.createResource(rttFilelURI);

		InMemoryEmfModel inMemoryEmfModel = new InMemoryEmfModel("Target",
				resource, rttPackage);
		inMemoryEmfModel.setReadOnLoad(false);
		inMemoryEmfModel.setStoredOnDisposal(true);
		inMemoryEmfModel.setMetamodelUri("http://rtt/1.0");
		inMemoryEmfModel.setResource(resource);
		inMemoryEmfModel.setMetamodelFileBased(false);
		inMemoryEmfModel.setModelFileUri(rttFilelURI);

		return inMemoryEmfModel;
	}
	
	private void openEditor() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject diagramRoot = null;
		try {
			Resource resource = resourceSet.getResource(domainModelURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			RttDiagramEditorPlugin.getInstance().logError(
					"Unable to load resource: " + domainModelURI, ex); //$NON-NLS-1$
		}
		if (diagramRoot == null) {
			MessageDialog.openError(getShell(),
					Messages.InitDiagramFile_ResourceErrorDialogTitle,
					Messages.InitDiagramFile_ResourceErrorDialogMessage);
			return;
		}
		Wizard wizard = new RttNewDiagramFileWizard(domainModelURI,
				diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle,
				PackageEditPart.MODEL_ID));
		RttDiagramEditorUtil.runWizard(getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
	}

	private Shell getShell() {
		shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		return shell;
	}
}
