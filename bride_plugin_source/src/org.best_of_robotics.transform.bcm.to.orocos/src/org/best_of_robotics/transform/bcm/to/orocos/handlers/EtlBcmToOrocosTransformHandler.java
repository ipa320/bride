package org.best_of_robotics.transform.bcm.to.orocos.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class EtlBcmToOrocosTransformHandler extends AbstractHandler {

	public EtlBcmToOrocosTransformHandler() {
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {

		String commandName = "";
		try {
			commandName = event.getCommand().getName();
		} catch (NotDefinedException e) {
			e.printStackTrace();
		}
		
		EtlTransformOperationJob job = new EtlTransformOperationJob(commandName);
		
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		ISelection selection = window.getSelectionService().getSelection();
		ITreeSelection structuredSelection = (ITreeSelection) selection;
		Object element = structuredSelection.getFirstElement();
		IFile bcmModelFile = (IFile) element;
		
		job.setSelectedModelFile(bcmModelFile);
		job.setTransformationEntry("epsilon/bcmToOrocos.etl");
		job.setSourceMetaModelURI("http://bcm/1.0");
		job.setTargetMetaModelURI("http://rtt/1.0");
		job.setModelFileExtension(".rtt");
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceRuleFactory ruleFactory = workspace.getRuleFactory();
		ISchedulingRule rule = ruleFactory.modifyRule(bcmModelFile.getProject());
		job.setUser(true);
		job.setPriority(Job.INTERACTIVE);
		job.setRule(rule);
		job.schedule();

		return null;
	}



}
