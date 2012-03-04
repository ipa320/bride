package org.ros.model.ros.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.ros.model.ros.diagram.edit.policies.NodeItemSemanticEditPolicy;
import org.ros.model.ros.diagram.part.RosVisualIDRegistry;
import org.ros.model.ros.diagram.providers.RosElementTypes;

/**
 * @generated
 */
public class NodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public NodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new NodeFigure();
	}

	/**
	 * @generated
	 */
	public NodeFigure getPrimaryShape() {
		return (NodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof NodeNameEditPart) {
			((NodeNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureNodeNameFigure());
			return true;
		}
		if (childEditPart instanceof NodeParametersEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureParameterCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((NodeParametersEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof NodeNameEditPart) {
			return true;
		}
		if (childEditPart instanceof NodeParametersEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureParameterCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((NodeParametersEditPart) childEditPart).getFigure());
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
		super.addChildVisual(childEditPart, -1);
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
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof NodeParametersEditPart) {
			return getPrimaryShape().getFigureParameterCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure createNodeFigure() {
		org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(RosVisualIDRegistry
				.getType(NodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(RosElementTypes.ServiceClient_4001);
		types.add(RosElementTypes.Subscriber_4002);
		types.add(RosElementTypes.ServiceServer_4003);
		types.add(RosElementTypes.Publisher_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(RosElementTypes.ServiceClient_4001);
		}
		if (targetEditPart instanceof TopicEditPart) {
			types.add(RosElementTypes.Subscriber_4002);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(RosElementTypes.ServiceServer_4003);
		}
		if (targetEditPart instanceof TopicEditPart) {
			types.add(RosElementTypes.Publisher_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == RosElementTypes.ServiceClient_4001) {
			types.add(RosElementTypes.Service_2003);
		} else if (relationshipType == RosElementTypes.Subscriber_4002) {
			types.add(RosElementTypes.Topic_2002);
		} else if (relationshipType == RosElementTypes.ServiceServer_4003) {
			types.add(RosElementTypes.Service_2003);
		} else if (relationshipType == RosElementTypes.Publisher_4004) {
			types.add(RosElementTypes.Topic_2002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == RosElementTypes.Parameter_3001) {
				return getChildBySemanticHint(RosVisualIDRegistry
						.getType(NodeParametersEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class NodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNodeNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureParameterCompartmentFigure;

		/**
		 * @generated
		 */
		public NodeFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureNodeNameFigure = new WrappingLabel();
			fFigureNodeNameFigure.setText("<...>");

			GridData constraintFFigureNodeNameFigure = new GridData();
			constraintFFigureNodeNameFigure.verticalAlignment = GridData.BEGINNING;
			constraintFFigureNodeNameFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureNodeNameFigure.horizontalIndent = 0;
			constraintFFigureNodeNameFigure.horizontalSpan = 1;
			constraintFFigureNodeNameFigure.verticalSpan = 1;
			constraintFFigureNodeNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureNodeNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureNodeNameFigure, constraintFFigureNodeNameFigure);

			fFigureParameterCompartmentFigure = new RectangleFigure();

			GridData constraintFFigureParameterCompartmentFigure = new GridData();
			constraintFFigureParameterCompartmentFigure.verticalAlignment = GridData.FILL;
			constraintFFigureParameterCompartmentFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureParameterCompartmentFigure.horizontalIndent = 0;
			constraintFFigureParameterCompartmentFigure.horizontalSpan = 1;
			constraintFFigureParameterCompartmentFigure.verticalSpan = 1;
			constraintFFigureParameterCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFFigureParameterCompartmentFigure.grabExcessVerticalSpace = true;
			this.add(fFigureParameterCompartmentFigure,
					constraintFFigureParameterCompartmentFigure);

			fFigureParameterCompartmentFigure
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNodeNameFigure() {
			return fFigureNodeNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureParameterCompartmentFigure() {
			return fFigureParameterCompartmentFigure;
		}

	}

}
