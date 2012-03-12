package org.ros.model.ros.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.ros.model.ros.diagram.edit.policies.PublisherItemSemanticEditPolicy;

/**
 * @generated
 */
public class PublisherEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public PublisherEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PublisherItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PublisherNameEditPart) {
			((PublisherNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigurePublisherNameFigure());
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
		if (childEditPart instanceof PublisherNameEditPart) {
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
		return new PublisherFigure();
	}

	/**
	 * @generated
	 */
	public PublisherFigure getPrimaryShape() {
		return (PublisherFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class PublisherFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePublisherNameFigure;

		/**
		 * @generated
		 */
		public PublisherFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePublisherNameFigure = new WrappingLabel();
			fFigurePublisherNameFigure.setText("<...>");

			this.add(fFigurePublisherNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePublisherNameFigure() {
			return fFigurePublisherNameFigure;
		}

	}

}
