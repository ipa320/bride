package org.best_of_robotics.transform.orocos.to.cplusplus.jobs;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.best_of_robotics.transform.orocos.to.cplusplus.Activator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.exceptions.EglRuntimeException;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.orocos.model.rtt.RttPackage;

public class MergedPropertiesJob extends WorkspaceJob {
	
	private String transformEntryPath = "epsilon/mergedProperties.egl";
	private IProject project;
	private InMemoryEmfModel sourceModel;

	public MergedPropertiesJob(String name) {
		super(name);
	}

	@Override
	public IStatus runInWorkspace(IProgressMonitor monitor)
			throws CoreException {
		monitor.beginTask(getName(), 4);

		URL transformationEntry = Activator.getDefault().getBundle()
				.getEntry(transformEntryPath);
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

		EglFileGeneratingTemplateFactory eglTemplateFactory = new EglFileGeneratingTemplateFactory();
		IEolExecutableModule eglModule = new EglTemplateFactoryModuleAdapter(
				eglTemplateFactory);
		try {
			eglTemplateFactory.setOutputRoot(project
					.getLocation().toOSString());
			eglModule.parse(transformURI);
		} catch (EglRuntimeException e2) {
			e2.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		monitor.worked(1);

		if (eglModule.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : eglModule.getParseProblems()) {
				System.err.println(problem.toString());
			}
		}
		eglModule.getContext().getModelRepository().addModel(sourceModel);
		try {
			eglModule.execute();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		eglModule.getContext().getModelRepository().dispose();
		monitor.done();
		return Status.OK_STATUS;
	}
	
	public void setProject(IProject project) {
		this.project = project;
	}

	public void createSource(Resource resource) {
		if (resource != null) {
			sourceModel = new InMemoryEmfModel(
					"Source", resource, RttPackage.eINSTANCE);
			sourceModel.setReadOnLoad(true);
			sourceModel.setStoredOnDisposal(false);
		}
	}
	
	

}
