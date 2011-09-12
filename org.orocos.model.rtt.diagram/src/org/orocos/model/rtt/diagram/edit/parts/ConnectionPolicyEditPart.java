package org.orocos.model.rtt.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.orocos.model.rtt.diagram.edit.policies.ConnectionPolicyItemSemanticEditPolicy;

/**
 * @generated
 */
public class ConnectionPolicyEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public ConnectionPolicyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ConnectionPolicyItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConnectionPolicyNameEditPart) {
			((ConnectionPolicyNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureConnectionPolicyNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ConnectionPolicyNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ConnectionPolicyFigure();
	}

	/**
	 * @generated
	 */
	public ConnectionPolicyFigure getPrimaryShape() {
		return (ConnectionPolicyFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ConnectionPolicyFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureConnectionPolicyNameFigure;

		/**
		 * @generated
		 */
		public ConnectionPolicyFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureConnectionPolicyNameFigure = new WrappingLabel();
			fFigureConnectionPolicyNameFigure.setText("<...>");

			this.add(fFigureConnectionPolicyNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureConnectionPolicyNameFigure() {
			return fFigureConnectionPolicyNameFigure;
		}

	}

}
