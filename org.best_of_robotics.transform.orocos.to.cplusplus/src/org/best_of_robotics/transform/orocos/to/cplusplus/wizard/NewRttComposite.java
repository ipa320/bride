package org.best_of_robotics.transform.orocos.to.cplusplus.wizard;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;

import org.best_of_robotics.model.Cpf.CpfFactory;
import org.best_of_robotics.model.Cpf.CpfPackage;
import org.best_of_robotics.transform.orocos.to.cplusplus.Activator;
import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.core.model.ICContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.ecl.EclModule;
import org.eclipse.epsilon.ecl.trace.MatchTrace;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eml.EmlModule;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.ModelRepository;
import org.eclipse.epsilon.erl.ErlModule;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.orocos.model.rtt.RttFactory;
import org.orocos.model.rtt.RttPackage;

public class NewRttComposite extends Wizard implements INewWizard {

	private String comparisonPath = "epsilon/rtt.ecl";
	private String mergePath = "epsilon/compositeMerge.eml";
	private IWorkbench workbench;
	private NewRttCompositeMainPage mainPage;
	private ModelRepository modelRepository;
	private MatchTrace matchTrace;
	private String location;

	public NewRttComposite() {
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
			doComparison(leftResource, rightResource);
			doMerge();
		}
		openEditor();
		return true;
	}

	private void doComparison(IResource leftResource, IResource rightResource) {
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
		//emf resource not set
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
		
		String targetRttFile = location + "/composite.rtt";

		RttPackage rttPackage = RttFactory.eINSTANCE.getRttPackage();

		ResourceSet resourceSet = new ResourceSetImpl();
		org.eclipse.emf.common.util.URI cpfFilelURI = org.eclipse.emf.common.util.URI
				.createFileURI(targetRttFile);
		Resource resource = resourceSet.createResource(cpfFilelURI);

		InMemoryEmfModel inMemoryEmfModel = new InMemoryEmfModel("Target",
				resource, rttPackage);
		inMemoryEmfModel.setReadOnLoad(false);
		inMemoryEmfModel.setStoredOnDisposal(true);
		inMemoryEmfModel.setMetamodelUri("http://rtt/1.0");
		inMemoryEmfModel.setResource(resource);
		inMemoryEmfModel.setMetamodelFileBased(false);
		inMemoryEmfModel.setModelFileUri(cpfFilelURI);

		return inMemoryEmfModel;
	}

	private void openEditor() {
		// TODO Auto-generated method stub
		
	}

}
