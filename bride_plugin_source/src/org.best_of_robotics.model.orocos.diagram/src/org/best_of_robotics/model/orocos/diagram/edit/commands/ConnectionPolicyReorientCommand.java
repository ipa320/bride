package org.best_of_robotics.model.orocos.diagram.edit.commands;

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
public class ConnectionPolicyReorientCommand extends EditElementCommand {

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
	public ConnectionPolicyReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof org.best_of_robotics.model.orocos.ConnectionPolicy) {
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
		if (!(oldEnd instanceof org.best_of_robotics.model.orocos.OutputPort && newEnd instanceof org.best_of_robotics.model.orocos.OutputPort)) {
			return false;
		}
		org.best_of_robotics.model.orocos.InputPort target = getLink()
				.getInputPort();
		if (!(getLink().eContainer() instanceof org.best_of_robotics.model.orocos.Package)) {
			return false;
		}
		org.best_of_robotics.model.orocos.Package container = (org.best_of_robotics.model.orocos.Package) getLink()
				.eContainer();
		return org.best_of_robotics.model.orocos.diagram.edit.policies.OrocosBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnectionPolicy_4001(container,
						getLink(), getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof org.best_of_robotics.model.orocos.InputPort && newEnd instanceof org.best_of_robotics.model.orocos.InputPort)) {
			return false;
		}
		org.best_of_robotics.model.orocos.OutputPort source = getLink()
				.getOutputPort();
		if (!(getLink().eContainer() instanceof org.best_of_robotics.model.orocos.Package)) {
			return false;
		}
		org.best_of_robotics.model.orocos.Package container = (org.best_of_robotics.model.orocos.Package) getLink()
				.eContainer();
		return org.best_of_robotics.model.orocos.diagram.edit.policies.OrocosBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistConnectionPolicy_4001(container,
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
		getLink().setOutputPort(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setInputPort(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.orocos.ConnectionPolicy getLink() {
		return (org.best_of_robotics.model.orocos.ConnectionPolicy) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.orocos.OutputPort getOldSource() {
		return (org.best_of_robotics.model.orocos.OutputPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.orocos.OutputPort getNewSource() {
		return (org.best_of_robotics.model.orocos.OutputPort) newEnd;
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.orocos.InputPort getOldTarget() {
		return (org.best_of_robotics.model.orocos.InputPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected org.best_of_robotics.model.orocos.InputPort getNewTarget() {
		return (org.best_of_robotics.model.orocos.InputPort) newEnd;
	}
}
