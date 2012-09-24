package org.orocos.model.rtt.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.orocos.model.rtt.ConnectionPolicy;
import org.orocos.model.rtt.InputPort;
import org.orocos.model.rtt.OutputPort;
import org.orocos.model.rtt.Package;
import org.orocos.model.rtt.diagram.edit.policies.RttBaseItemSemanticEditPolicy;

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
		if (false == getElementToEdit() instanceof ConnectionPolicy) {
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
		if (!(oldEnd instanceof OutputPort && newEnd instanceof OutputPort)) {
			return false;
		}
		InputPort target = getLink().getInputPort();
		if (!(getLink().eContainer() instanceof Package)) {
			return false;
		}
		Package container = (Package) getLink().eContainer();
		return RttBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnectionPolicy_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof InputPort && newEnd instanceof InputPort)) {
			return false;
		}
		OutputPort source = getLink().getOutputPort();
		if (!(getLink().eContainer() instanceof Package)) {
			return false;
		}
		Package container = (Package) getLink().eContainer();
		return RttBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnectionPolicy_4001(container, getLink(), source,
						getNewTarget());
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
	protected ConnectionPolicy getLink() {
		return (ConnectionPolicy) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected OutputPort getOldSource() {
		return (OutputPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected OutputPort getNewSource() {
		return (OutputPort) newEnd;
	}

	/**
	 * @generated
	 */
	protected InputPort getOldTarget() {
		return (InputPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected InputPort getNewTarget() {
		return (InputPort) newEnd;
	}
}
