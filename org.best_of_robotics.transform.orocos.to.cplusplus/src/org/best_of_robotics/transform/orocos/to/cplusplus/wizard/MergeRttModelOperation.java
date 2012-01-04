package org.best_of_robotics.transform.orocos.to.cplusplus.wizard;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;

import org.best_of_robotics.transform.orocos.to.cplusplus.Activator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.orocos.model.rtt.RttFactory;
import org.orocos.model.rtt.RttPackage;

public class MergeRttModelOperation extends WorkspaceModifyOperation {
	
	private class ComparisonResult {
		
		private MatchTrace matchTrace;
		private ModelRepository modelRepository;

		protected ComparisonResult(MatchTrace matchTrace,
				ModelRepository modelRepository) {
			this.matchTrace = matchTrace;
			this.modelRepository = modelRepository;
		}
		
		protected MatchTrace getMatchTrace() {
			return this.matchTrace;
		}
		
		protected ModelRepository getModelRepository() {
			return this.modelRepository;
		}
	}

	private static final String ECL_PATH = "epsilon/rtt.ecl";
	private static final String EML_PATH = "epsilon/rttMerge.eml";
	private LinkedList<IResource> rttModelList;
	private org.eclipse.emf.common.util.URI rttFilelURI;
	private EmfModel rttModel;
	
	public MergeRttModelOperation(LinkedList<IResource> rttModelList, IFile rttResource) {
		super();
		this.rttModelList = rttModelList;
		this.rttFilelURI = org.eclipse.emf.common.util.URI.createFileURI(rttResource.getLocation().toOSString());
		this.rttModel = createEmfModel(rttResource, "Left", "Source");
	}

	@Override
	protected void execute(IProgressMonitor monitor) throws CoreException,
			InvocationTargetException, InterruptedException {

		int workedCount = 0;
		monitor.beginTask("RTT Merge", rttModelList.size());
		while (!rttModelList.isEmpty()) {
			IResource nextResource = rttModelList.remove();
			try {
				rttModel.load();
			} catch (EolModelLoadingException e) {
				e.printStackTrace();
			}
			doMerge(nextResource);
			monitor.worked(workedCount++);
		}
	}

	private IResource doMerge(IResource nextResource) {
		ComparisonResult comparisonResult = doComparison(nextResource);
		
		URI transformURI = createURIforTransformationFile(EML_PATH);
		EmlModule emlModule = new EmlModule();
		try {
			emlModule.parse(transformURI);
		} catch (Exception e) {
			e.printStackTrace();
		}
		checkforParseErrors(emlModule);
		
		emlModule.getContext().setMatchTrace(comparisonResult.getMatchTrace());
		emlModule.getContext().setModelRepository(comparisonResult.getModelRepository());
		
		EmfModel target = createMergedModel();
		emlModule.getContext().getModelRepository().addModel(target);
		
		try {
			emlModule.execute();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		
		emlModule.getContext().getModelRepository().dispose();
		emlModule.getContext().getExecutorFactory().getExecutionController().dispose();
		
		return null;
	}
	
	private EmfModel createMergedModel() {
		
		RttPackage rttPackage = RttFactory.eINSTANCE.getRttPackage();

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(rttFilelURI);

		InMemoryEmfModel inMemoryEmfModel = new InMemoryEmfModel("Target",
				resource, rttPackage);
		inMemoryEmfModel.setReadOnLoad(false);////////////////////////////////////////
		inMemoryEmfModel.setStoredOnDisposal(true);
		inMemoryEmfModel.setMetamodelUri("http://rtt/1.0");
		inMemoryEmfModel.setResource(resource);
		inMemoryEmfModel.setMetamodelFileBased(false);
		inMemoryEmfModel.setModelFileUri(rttFilelURI);

		return inMemoryEmfModel;
	}

	private ComparisonResult doComparison(IResource nextResource) {
		URI transformURI = createURIforTransformationFile(ECL_PATH);
		EclModule eclModule = new EclModule();
		
		try {
			eclModule.parse(transformURI);
		} catch (Exception e) {
			e.printStackTrace();
		}
		checkforParseErrors(eclModule);
		
		EmfModel rightModel = createEmfModel(nextResource, "Right", "Source");
		eclModule.getContext().getModelRepository().addModel(rttModel);
		eclModule.getContext().getModelRepository().addModel(rightModel);
		
		try {
			eclModule.execute();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		
		MatchTrace matchTrace = eclModule.getContext().getMatchTrace().getReduced();
		ModelRepository modelRepository = eclModule.getContext().getModelRepository();
		
		eclModule.getContext().getExecutorFactory().getExecutionController().dispose();
		
		return new ComparisonResult(matchTrace, modelRepository);
	}

	private URI createURIforTransformationFile(String transformationPath) {
		URL transformationEntry = Activator.getDefault().getBundle()
				.getEntry(transformationPath);
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
	
	private void checkforParseErrors(ErlModule erlModule) {
		if (erlModule.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : erlModule.getParseProblems()) {
				System.err.println(problem.toString());
			}
		}
	}
	
	private EmfModel createEmfModel(IResource resource, String name, String alias) {
		EmfModel emfModel = new EmfModel();
		emfModel.setName(name);
		emfModel.getAliases().add(alias);
		emfModel.setMetamodelUri("http://rtt/1.0");
		emfModel.setModelFile(resource.getLocation().toOSString());
		emfModel.setReadOnLoad(true);
		emfModel.setStoredOnDisposal(false);
		try {
			emfModel.load();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		}
		return emfModel;
	}

}
