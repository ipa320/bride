package org.best_of_robotics.transform.ros.to.cplusplus;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.best_of_robotics.transform.service.parameter.IEglTransformParameter;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;

public class EGLTransformer {
	
	IEglTransformParameter parameter;
	
	public EGLTransformer(IEglTransformParameter param) {
		parameter = param;
		
	}
	
	public void transform()
	{
		//URL transformationEntry = Platform.getBundle(parameter.getPluginID()).getEntry(parameter.getEglTransformation());
		URL transformationEntry = null;
		try {
			transformationEntry = new URL(parameter.getEglTransformation());
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
		
		

		EglFileGeneratingTemplateFactory eglTemplateFactory = new EglFileGeneratingTemplateFactory();
		IEolExecutableModule eglModule = new EglTemplateFactoryModuleAdapter(
				eglTemplateFactory);
		try {
			eglTemplateFactory.setOutputRoot(parameter.getOutputRoot());
			eglModule.parse(transformURI);
		} catch (EglRuntimeException e2) {
			e2.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (eglModule.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : eglModule.getParseProblems()) {
				System.err.println(problem.toString());
			}
		}
		eglModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
		
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
		
		eglModule.getContext().getModelRepository().addModel(emfModel);
		try {
			eglModule.execute();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		eglModule.getContext().getModelRepository().dispose();
	}

}
