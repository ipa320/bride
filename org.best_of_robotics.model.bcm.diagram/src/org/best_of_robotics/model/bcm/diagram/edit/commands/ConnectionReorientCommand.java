package org.best_of_robotics.model.bcm.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ConnectionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

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
	public ConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof org.best_of_robotics.model.bcm.Connection) {
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
		if (!(oldEnd instanceof org.best_of_robotics.model.bcm.Port && newEnd instanceof org.best_of_robotics.model.bcm.Port)) {
			return false;
		}
		org.best_of_robotics.model.bcm.Port target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof org.best_of_robotics.model.bcm.Bundle)) {
			return false;
		}
		org.best_of_robotics.model.bcm.Bundle container = (org.best_of_robotics.model.bcm.Bundle) getLink()
				.eContainer();
		return org.best_of_robotics.model.bcm.diagram.edit.policies.BcmBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnection_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.best_of_robotics.model.bcm.Port && newEnd instanceof org.best_of_robotics.model.bcm.Port)) {
			return false;
		}
		org.best_of_robotics.model.bcm.Port source = getLink().getSource();
		if (!(getLink().eContainer() instanceof org.best_of_robotics.model.bcm.Bundle)) {
			return false;
		}
		org.best_of_robotics.model.bcm.Bundle container = (org.best_of_robotics.model.bcm.Bundle) getLink()
				.eContainer();
		return org.best_of_robotics.model.bcm.diagram.edit.policies.BcmBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnection_4001(container,
						getLink(), source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.bcm.Connection getLink() {
		return (org.best_of_robotics.model.bcm.Connection) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.bcm.Port getOldSource() {
		return (org.best_of_robotics.model.bcm.Port) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.bcm.Port getNewSource() {
		return (org.best_of_robotics.model.bcm.Port) newEnd;
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.bcm.Port getOldTarget() {
		return (org.best_of_robotics.model.bcm.Port) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.bcm.Port getNewTarget() {
		return (org.best_of_robotics.model.bcm.Port) newEnd;
	}
}
