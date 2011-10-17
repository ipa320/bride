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

import java.util.ArrayList;

import org.best_of_robotics.transform.orocos.to.cplusplus.jobs.EglTransformOperationJob;
import org.best_of_robotics.transform.orocos.to.cplusplus.jobs.EtlTransformOperationJob;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.orocos.model.rtt.TaskContext;
import org.orocos.model.rtt.diagram.part.RttDiagramEditor;

/**
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class RttTransformHandler extends AbstractHandler {

	private RttDiagramEditor rttDiagramEdtior;
	private IProject project;
	private EglTransformOperationJob eglJob;
	private EtlTransformOperationJob etlJob;
	private ArrayList<IMarker> problems = new ArrayList<IMarker>();

	public RttTransformHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart editor = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		if (!(editor instanceof RttDiagramEditor)) {
			MessageDialog
					.openError(
							PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getShell(),
							"Error on Editor Selection",
							"Please select the editor from which you want to generate code and execute command again.");
			return null;
		} else {
			rttDiagramEdtior = (RttDiagramEditor) editor;
		}

		String commandName = "";
		try {
			commandName = event.getCommand().getName();
		} catch (NotDefinedException e) {
			e.printStackTrace();
		}

		Resource resource = getFirstSemanticModelResource(rttDiagramEdtior
				.getEditingDomain().getResourceSet());

		if (!check(resource)) {
			Shell shell = PlatformUI.getWorkbench().getDisplay()
			.getActiveShell();
			MessageDialog
					.openError(
							shell,
							"Model Not Valid Error",
							"The are problems with model. Please check the Problem View for more information.");
			try {
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage()
						.showView("org.eclipse.ui.views.ProblemView").setFocus();
			} catch (PartInitException e) {
				e.printStackTrace();
			}
			return null;
		}
		
		eglJob = new EglTransformOperationJob(commandName);
		etlJob = new EtlTransformOperationJob(commandName);

		initializeJobs(resource);

		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceRuleFactory ruleFactory = workspace.getRuleFactory();
		ISchedulingRule rule = ruleFactory.modifyRule(project);

		eglJob.setUser(true);
		eglJob.setPriority(Job.INTERACTIVE);
		eglJob.setRule(rule);
		eglJob.schedule();

		etlJob.setUser(true);
		etlJob.setPriority(Job.INTERACTIVE);
		etlJob.setRule(rule);
		etlJob.schedule();

		return null;
	}

	private void initializeJobs(Resource resource) {
		FileEditorInput fileEditorInput = (FileEditorInput) rttDiagramEdtior
				.getEditorInput();
		project = fileEditorInput.getFile().getProject();
		eglJob.setProject(project);
		etlJob.setProject(project);
		etlJob.setTargetFile(fileEditorInput.getFile());
		eglJob.createSource(resource);
		etlJob.createSource(resource);
	}

	private boolean check(Resource resource) {
		if (resource == null) return false;
		org.orocos.model.rtt.Package rttPackage = (org.orocos.model.rtt.Package) resource.getContents().get(0);
		for (IMarker marker : problems) {
			try {
				marker.delete();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		problems.clear();
		if (rttPackage.getName() == null || rttPackage.getName().equals("")) {
			problems.add(createProblemMarker("Package name is not set in diagram."));
		}
		EList<TaskContext> taskContexts = rttPackage.getTaskContext();
		for (TaskContext taskContext : taskContexts) {
			if (taskContext.getNamespace() == null || taskContext.getNamespace().equals("")) {
				problems.add(createProblemMarker("Namespace is not set for " + taskContext.getName()));
			}
			if (taskContext.getType() == null || taskContext.getType().equals("")) {
				problems.add(createProblemMarker("Type is not set for " + taskContext.getName()));
			}
		}
		if (!problems.isEmpty()) return false;
		return true;
	}

	private IMarker createProblemMarker(String message) {
		try {
			IMarker problemMarker = ResourcesPlugin.getWorkspace().getRoot().createMarker(IMarker.PROBLEM);
			problemMarker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			problemMarker.setAttribute(IMarker.MESSAGE, message);
			problemMarker.setAttribute(IMarker.TRANSIENT, true);
			problemMarker.setAttribute(IMarker.LOCATION, "RTT Graphical Editor");
			return problemMarker;
		} catch (CoreException e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public Resource getFirstSemanticModelResource(ResourceSet resourceSet) {
		for (Resource resource : resourceSet.getResources()) {
			if (!(resource instanceof GMFResource)) {
				return resource;
			}
		}
		return null;
	}

}
