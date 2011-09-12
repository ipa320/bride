package org.best_of_robotics.transform.bcm.to.orocos.handlers;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.best_of_robotics.transform.bcm.to.orocos.Activator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.etl.EtlModule;
import org.orocos.model.rtt.Package;
import org.orocos.model.rtt.RttFactory;

public class EtlTransformOperationJob extends WorkspaceJob {

	private IFile selectedModelFile;
	private String transformationEntryPath;
	private String sourceMetaModelURI;
	private String targetMetaModelURI;
	private String modelFileExtension;

	public EtlTransformOperationJob(String name) {
		super(name);
	}

	public void setSelectedModelFile(IFile selectedModelFile) {
		this.selectedModelFile = selectedModelFile;
	}

	public void setTransformationEntry(String transformationEntryPath) {
		this.transformationEntryPath = transformationEntryPath;
	}

	public void setSourceMetaModelURI(String sourceMetaModelURI) {
		this.sourceMetaModelURI = sourceMetaModelURI;
	}

	public void setTargetMetaModelURI(String targetMetaModelURI) {
		this.targetMetaModelURI = targetMetaModelURI;
	}

	public void setModelFileExtension(String modelFileExtension) {
		this.modelFileExtension = modelFileExtension;
	}
	
	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor)
			throws CoreException {
		monitor.beginTask(getName(), 4);
		
		URL transformationEntry = Activator.getDefault().getBundle()
				.getEntry(transformationEntryPath);
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

		monitor.worked(1);
		
		IEolExecutableModule etlModule = new EtlModule();
		try {
			etlModule.parse(transformURI);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		monitor.worked(1);
		
		if (etlModule.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : etlModule.getParseProblems()) {
				System.err.println(problem.toString());
			}
		}
		etlModule.getContext().getModelRepository().addModel(createSource());
		etlModule.getContext().getModelRepository().addModel(createTarget());
		try {
			etlModule.execute();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		monitor.worked(1);
		etlModule.getContext().getModelRepository().dispose();
		monitor.done();
		return Status.OK_STATUS;
	}

	protected EmfModel createSource() {

		String oss = selectedModelFile.getLocation().toOSString();

		EmfModel emfModel = new EmfModel();
		emfModel.setName("Source");
		emfModel.setMetamodelUri(sourceMetaModelURI);
		emfModel.setModelFile(oss);
		emfModel.setReadOnLoad(true);
		emfModel.setStoredOnDisposal(false);
		try {
			emfModel.load();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		}
		return emfModel;
	}

	protected EmfModel createTarget() {

		String model = selectedModelFile.getProject().getLocation().toOSString()
				+ "/" + selectedModelFile.getName() + modelFileExtension;

		Package rttPackage = RttFactory.eINSTANCE.createPackage();
		ResourceSet resourceSet = new ResourceSetImpl();
		org.eclipse.emf.common.util.URI orocosModelURI = org.eclipse.emf.common.util.URI
				.createFileURI(model);
		Resource resource = resourceSet.createResource(orocosModelURI);
		resource.getContents().add(rttPackage);
		// add the name form the bcm model...
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		EmfModel emfModel = new EmfModel();
		emfModel.setName("Target");
		emfModel.setMetamodelUri(targetMetaModelURI);
		emfModel.setModelFileUri(orocosModelURI);
		emfModel.setReadOnLoad(false);
		emfModel.setStoredOnDisposal(true);
		try {
			emfModel.load();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		}
		return emfModel;
	}
}
