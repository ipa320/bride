package org.best_of_robotics.transform.ros.to.cplusplus;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.best_of_robotics.transform.service.parameter.IEtlTransformParameter;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.etl.EtlModule;

public class EtlTransformer {

	private IEtlTransformParameter parameter;

	
	public EtlTransformer(IEtlTransformParameter etlTransformParameter) {
		parameter = etlTransformParameter;
		
	}

	public void transform()
	{


		//URL transformationEntry = Platform.getBundle(parameter.getPluginID()).getEntry(parameter.getEtlTransformPath());
		URL transformationEntry = null;
		try {
			transformationEntry = new URL(parameter.getEtlTransformPath());
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
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

		IEolExecutableModule etlModule = new EtlModule();
		try {
			etlModule.parse(transformURI);
		} catch (Exception e) {
			e.printStackTrace();
		}

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


		etlModule.getContext().getModelRepository().dispose();

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


}
