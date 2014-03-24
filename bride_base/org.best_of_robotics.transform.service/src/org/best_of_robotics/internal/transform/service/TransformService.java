package org.best_of_robotics.internal.transform.service;

import org.best_of_robotics.internal.transform.service.job.EglJob;
import org.best_of_robotics.internal.transform.service.job.EtlJob;
import org.best_of_robotics.internal.transform.service.parameter.EglTransformParameter;
import org.best_of_robotics.internal.transform.service.parameter.EtlTransformParameter;
import org.best_of_robotics.transform.service.ITransformService;
import org.best_of_robotics.transform.service.parameter.IEglTransformParameter;
import org.best_of_robotics.transform.service.parameter.IEtlTransformParameter;
import org.best_of_robotics.transform.service.parameter.ITransformParameter;
import org.eclipse.core.resources.IResourceRuleFactory;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;

public class TransformService implements ITransformService {

	public TransformService() {
	}

	@Override
	public void doTransform(ITransformParameter transformParameter) {
		WorkspaceJob job = null;
		if (transformParameter instanceof IEglTransformParameter) {
			job = EglJob.createJob((EglTransformParameter) transformParameter);
		}
		if (transformParameter instanceof IEtlTransformParameter) {
			job = EtlJob.createJob((EtlTransformParameter) transformParameter);
		}
		executeJob(job);
	}
	
	private void executeJob(WorkspaceJob job) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IResourceRuleFactory ruleFactory = workspace.getRuleFactory();
		ISchedulingRule rule = ruleFactory.modifyRule(workspace.getRoot());
		job.setUser(true);
		job.setPriority(Job.INTERACTIVE);
		job.setRule(rule);
		job.schedule();
	}

}
