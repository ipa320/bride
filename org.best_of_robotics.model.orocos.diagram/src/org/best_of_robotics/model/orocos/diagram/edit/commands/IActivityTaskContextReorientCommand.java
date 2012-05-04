package org.best_of_robotics.model.orocos.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class IActivityTaskContextReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public IActivityTaskContextReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof org.best_of_robotics.model.orocos.IActivity) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof org.best_of_robotics.model.orocos.TaskContext && newEnd instanceof org.best_of_robotics.model.orocos.IActivity)) {
			return false;
		}
		return org.best_of_robotics.model.orocos.diagram.edit.policies.OrocosBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistIActivityTaskContext_4002(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.best_of_robotics.model.orocos.TaskContext && newEnd instanceof org.best_of_robotics.model.orocos.TaskContext)) {
			return false;
		}
		return org.best_of_robotics.model.orocos.diagram.edit.policies.OrocosBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistIActivityTaskContext_4002(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setTaskContext(null);
		getNewSource().setTaskContext(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setTaskContext(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.orocos.IActivity getOldSource() {
		return (org.best_of_robotics.model.orocos.IActivity) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.orocos.IActivity getNewSource() {
		return (org.best_of_robotics.model.orocos.IActivity) newEnd;
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.orocos.TaskContext getOldTarget() {
		return (org.best_of_robotics.model.orocos.TaskContext) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.orocos.TaskContext getNewTarget() {
		return (org.best_of_robotics.model.orocos.TaskContext) newEnd;
	}
}
