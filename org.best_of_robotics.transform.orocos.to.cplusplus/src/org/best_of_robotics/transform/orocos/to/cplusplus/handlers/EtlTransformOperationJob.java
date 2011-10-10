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
package org.best_of_robotics.transform.orocos.to.cplusplus.handlers;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.best_of_robotics.model.Cpf.CpfFactory;
import org.best_of_robotics.model.Cpf.CpfPackage;
import org.best_of_robotics.transform.orocos.to.cplusplus.Activator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.commons.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.etl.EtlModule;

public class EtlTransformOperationJob extends WorkspaceJob {

	private String transformationEntryPath = "epsilon/rttTocpf.etl";
	private String modelFileExtension = ".cpf";
	private IProject project;
	private IFile targetFile;
	private EmfModel sourceModel;

	public EtlTransformOperationJob(String name) {
		super(name);
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
		etlModule.getContext().getModelRepository().addModel(createTarget());
		etlModule.getContext().getModelRepository().addModel(sourceModel);
		etlModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
		
		try {
			etlModule.execute();
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		etlModule.getContext().getModelRepository().dispose();
		monitor.done();
		return Status.OK_STATUS;
	}

	protected EmfModel createSource(Resource resource) {

		sourceModel = new EmfModel();
		sourceModel.setName("Source");
		sourceModel.setMetamodelUri("http://rtt/1.0");
		sourceModel.setResource(resource);
		IFile modelFile = ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getFile(
						new Path(resource.getURI().path()
								.substring("/resource/".length())));
		sourceModel.setModelFile(modelFile.getLocation().toOSString());
		sourceModel.setReadOnLoad(true);
		sourceModel.setStoredOnDisposal(false);
		try {
			sourceModel.load();
		} catch (EolModelLoadingException e) {
			e.printStackTrace();
		}

		return sourceModel;
	}

	protected EmfModel createTarget() {

		String cpfFile = project.getLocation().toOSString() + "/deployment/"
				+ targetFile.getName() + modelFileExtension;

		CpfPackage cpfPackage = CpfFactory.eINSTANCE.getCpfPackage();

		ResourceSet resourceSet = new ResourceSetImpl();
		org.eclipse.emf.common.util.URI cpfFilelURI = org.eclipse.emf.common.util.URI
				.createFileURI(cpfFile);
		Resource resource = resourceSet.createResource(cpfFilelURI);

		InMemoryEmfModel inMemoryEmfModel = new InMemoryEmfModel("Target",
				resource, cpfPackage);
		inMemoryEmfModel.setReadOnLoad(false);
		inMemoryEmfModel.setStoredOnDisposal(true);
		inMemoryEmfModel.setMetamodelUri("http://Cpf/1.0");
		inMemoryEmfModel.setResource(resource);
		inMemoryEmfModel.setMetamodelFileBased(false);
		inMemoryEmfModel.setModelFileUri(cpfFilelURI);

		return inMemoryEmfModel;
	}

	public void setProject(IProject project) {
		this.project = project;
	}

	public void setTargetFile(IFile file) {
		this.targetFile = file;

	}
}
