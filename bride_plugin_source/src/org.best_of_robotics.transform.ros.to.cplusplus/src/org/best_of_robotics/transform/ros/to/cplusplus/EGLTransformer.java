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
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

public class EGLTransformer {
	
	IEglTransformParameter parameter;
	int problem_;
	
	public EGLTransformer(IEglTransformParameter param) {
		parameter = param;
		problem_ = 0;
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
			showError();
		}
		URL resolvedTransformationURL = null;
		URI transformURI = null;
		
		try {
			resolvedTransformationURL = FileLocator
					.resolve(transformationEntry);
			transformURI = resolvedTransformationURL.toURI();
		} catch (IOException e) {
			e.printStackTrace();
			showError();
		} catch (URISyntaxException e) {
			e.printStackTrace();
			showError();
		}
		
		

		EglFileGeneratingTemplateFactory eglTemplateFactory = new EglFileGeneratingTemplateFactory();
		IEolExecutableModule eglModule = new EglTemplateFactoryModuleAdapter(
				eglTemplateFactory);
		try {
			eglTemplateFactory.setOutputRoot(parameter.getOutputRoot());
			eglModule.parse(transformURI);
		} catch (EglRuntimeException e2) {
			e2.printStackTrace();
			showError();
		} catch (Exception e) {
			e.printStackTrace();
			showError();
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
			showError();
		}
		
		eglModule.getContext().getModelRepository().addModel(emfModel);
		try {
			eglModule.execute();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
			showError();
		}
		eglModule.getContext().getModelRepository().dispose();
		if(problem_ == 0)
		{
			MessageDialog.openInformation(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Codegeneration finished",
				"The codegeneration was finished successfully. You might have to refresh you project to see the changes.");
		}
		
	}
	public void showError()
	{
		problem_ = 1;
		MessageDialog.openError(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Code generation failed.",
				"Something went wrong with the code generation. Please check the terminal for errors.");
	}

}
