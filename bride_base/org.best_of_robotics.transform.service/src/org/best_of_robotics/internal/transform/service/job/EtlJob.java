package org.best_of_robotics.internal.transform.service.job;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.best_of_robotics.internal.transform.service.parameter.EtlTransformParameter;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.etl.EtlModule;

public class EtlJob extends WorkspaceJob {

	private EtlTransformParameter parameter;

	private EtlJob(String name) {
		super(name);
	}

	private void setEtlTransformParameter(EtlTransformParameter parameter) {
		this.parameter = parameter;
	}

	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor)
			throws CoreException {

		monitor.beginTask(getName(), 4);

		URL transformationEntry = Platform.getBundle(parameter.getPluginID())
				.getEntry(parameter.getEtlTransformPath());
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
		EmfModel emfModel = new EmfModel();
		emfModel.setName(parameter.getSourceName());
		emfModel.setMetamodelUri(parameter.getSourceMetaModelURI());
		emfModel.setModelFile(parameter.getSourceModelFilePath());
		emfModel.setReadOnLoad(parameter.isSourceReadOnLoad());
		emfModel.setStoredOnDisposal(parameter.isSourceStoreOnDisposal());
		try {
			emfModel.load();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		}
		return emfModel;
	}

	protected EmfModel createTarget() {
		EmfModel emfModel = new EmfModel();
		emfModel.setName(parameter.getTargetName());
		emfModel.setMetamodelUri(parameter.getTargetMetaModelURI());
		emfModel.setModelFile(parameter.getTargetModelFilePath());
		emfModel.setReadOnLoad(parameter.isTargetReadOnLoad());
		emfModel.setStoredOnDisposal(parameter.isTargetStoreOnDisposal());
		try {
			emfModel.load();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		}
		return emfModel;
	}

	public static EtlJob createJob(EtlTransformParameter parameter) {
		EtlJob job = new EtlJob(parameter.getTransformName());
		job.setEtlTransformParameter(parameter);
		return job;
	}

}
