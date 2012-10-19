/**
 * Copyright (c) 2011 Katholieke Universiteit Leuven
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 * 
 *     Hugo A. Garica - initial API and implementation
 * and/or initial documentation.
 * 
 *     Herman Bruyninckx - Supervisor.
 */
package org.best_of_robotics.transform.ros.to.cplusplus.jobs;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.best_of_robotics.transform.ros.to.cplusplus.Activator;
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
import org.ros.model.ros.RosPackage;
import org.eclipse.epsilon.eol.dt.*;

public class Python_EglTransformOperationJob extends WorkspaceJob {

	private String transformEntryPath = "epsilon/python_package.egl";
	private IProject project;
	private InMemoryEmfModel sourceModel;

	public Python_EglTransformOperationJob(String name) {
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
		
		eglModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
		
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
					"Source", resource, RosPackage.eINSTANCE);
			sourceModel.setReadOnLoad(true);
			sourceModel.setStoredOnDisposal(false);
		}
		
	}

}
