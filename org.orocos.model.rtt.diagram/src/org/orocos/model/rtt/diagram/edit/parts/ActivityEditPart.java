package org.orocos.model.rtt.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
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
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.orocos.model.rtt.diagram.edit.policies.ActivityItemSemanticEditPolicy;
import org.orocos.model.rtt.diagram.part.RttVisualIDRegistry;
import org.orocos.model.rtt.diagram.providers.RttElementTypes;

/**
 * @generated
 */
public class ActivityEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public ActivityEditPart(View view) {
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
				new ActivityItemSemanticEditPolicy());
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
		return primaryShape = new ActivityFigure();
	}

	/**
	 * @generated
	 */
	public ActivityFigure getPrimaryShape() {
		return (ActivityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityNameEditPart) {
			((ActivityNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureActivityNameFigure());
			return true;
		}
		if (childEditPart instanceof ActivityCpuAffinityEditPart) {
			((ActivityCpuAffinityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureActivityCpuAffinityFigure());
			return true;
		}
		if (childEditPart instanceof ActivityPeriodEditPart) {
			((ActivityPeriodEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureActivityPeriodFigure());
			return true;
		}
		if (childEditPart instanceof ActivityPriorityEditPart) {
			((ActivityPriorityEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureActivityPriorityFigure());
			return true;
		}
		if (childEditPart instanceof ActivitySchedulerEditPart) {
			((ActivitySchedulerEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureActivitySchedulerFigure());
			return true;
		}
		if (childEditPart instanceof ActivitySlaveCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureSlaveCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ActivitySlaveCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityNameEditPart) {
			return true;
		}
		if (childEditPart instanceof ActivityCpuAffinityEditPart) {
			return true;
		}
		if (childEditPart instanceof ActivityPeriodEditPart) {
			return true;
		}
		if (childEditPart instanceof ActivityPriorityEditPart) {
			return true;
		}
		if (childEditPart instanceof ActivitySchedulerEditPart) {
			return true;
		}
		if (childEditPart instanceof ActivitySlaveCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureSlaveCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ActivitySlaveCompartmentEditPart) childEditPart)
					.getFigure());
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
		if (editPart instanceof ActivitySlaveCompartmentEditPart) {
			return getPrimaryShape().getFigureSlaveCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
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
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
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
		return getChildBySemanticHint(RttVisualIDRegistry
				.getType(ActivityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RttElementTypes.IActivityTaskContext_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TaskContextEditPart) {
			types.add(RttElementTypes.IActivityTaskContext_4002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == RttElementTypes.IActivityTaskContext_4002) {
			types.add(RttElementTypes.TaskContext_2001);
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
			if (type == RttElementTypes.Slave_3003) {
				return getChildBySemanticHint(RttVisualIDRegistry
						.getType(ActivitySlaveCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ActivityFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityCpuAffinityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityPeriodFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivityPriorityFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActivitySchedulerFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureSlaveCompartmentFigure;

		/**
		 * @generated
		 */
		public ActivityFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(3)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureActivityNameFigure = new WrappingLabel();
			fFigureActivityNameFigure.setText("<...>");

			GridData constraintFFigureActivityNameFigure = new GridData();
			constraintFFigureActivityNameFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureActivityNameFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureActivityNameFigure.horizontalIndent = 3;
			constraintFFigureActivityNameFigure.horizontalSpan = 1;
			constraintFFigureActivityNameFigure.verticalSpan = 1;
			constraintFFigureActivityNameFigure.grabExcessHorizontalSpace = false;
			constraintFFigureActivityNameFigure.grabExcessVerticalSpace = false;
			this.add(fFigureActivityNameFigure,
					constraintFFigureActivityNameFigure);

			fFigureActivityCpuAffinityFigure = new WrappingLabel();
			fFigureActivityCpuAffinityFigure.setText("<...>");

			GridData constraintFFigureActivityCpuAffinityFigure = new GridData();
			constraintFFigureActivityCpuAffinityFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureActivityCpuAffinityFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureActivityCpuAffinityFigure.horizontalIndent = 3;
			constraintFFigureActivityCpuAffinityFigure.horizontalSpan = 1;
			constraintFFigureActivityCpuAffinityFigure.verticalSpan = 1;
			constraintFFigureActivityCpuAffinityFigure.grabExcessHorizontalSpace = false;
			constraintFFigureActivityCpuAffinityFigure.grabExcessVerticalSpace = false;
			this.add(fFigureActivityCpuAffinityFigure,
					constraintFFigureActivityCpuAffinityFigure);

			fFigureActivityPeriodFigure = new WrappingLabel();
			fFigureActivityPeriodFigure.setText("<...>");

			GridData constraintFFigureActivityPeriodFigure = new GridData();
			constraintFFigureActivityPeriodFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureActivityPeriodFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureActivityPeriodFigure.horizontalIndent = 3;
			constraintFFigureActivityPeriodFigure.horizontalSpan = 1;
			constraintFFigureActivityPeriodFigure.verticalSpan = 1;
			constraintFFigureActivityPeriodFigure.grabExcessHorizontalSpace = false;
			constraintFFigureActivityPeriodFigure.grabExcessVerticalSpace = false;
			this.add(fFigureActivityPeriodFigure,
					constraintFFigureActivityPeriodFigure);

			fFigureActivityPriorityFigure = new WrappingLabel();
			fFigureActivityPriorityFigure.setText("<...>");

			GridData constraintFFigureActivityPriorityFigure = new GridData();
			constraintFFigureActivityPriorityFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureActivityPriorityFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureActivityPriorityFigure.horizontalIndent = 3;
			constraintFFigureActivityPriorityFigure.horizontalSpan = 1;
			constraintFFigureActivityPriorityFigure.verticalSpan = 1;
			constraintFFigureActivityPriorityFigure.grabExcessHorizontalSpace = false;
			constraintFFigureActivityPriorityFigure.grabExcessVerticalSpace = false;
			this.add(fFigureActivityPriorityFigure,
					constraintFFigureActivityPriorityFigure);

			fFigureActivitySchedulerFigure = new WrappingLabel();
			fFigureActivitySchedulerFigure.setText("<...>");

			GridData constraintFFigureActivitySchedulerFigure = new GridData();
			constraintFFigureActivitySchedulerFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureActivitySchedulerFigure.horizontalAlignment = GridData.BEGINNING;
			constraintFFigureActivitySchedulerFigure.horizontalIndent = 3;
			constraintFFigureActivitySchedulerFigure.horizontalSpan = 1;
			constraintFFigureActivitySchedulerFigure.verticalSpan = 1;
			constraintFFigureActivitySchedulerFigure.grabExcessHorizontalSpace = false;
			constraintFFigureActivitySchedulerFigure.grabExcessVerticalSpace = false;
			this.add(fFigureActivitySchedulerFigure,
					constraintFFigureActivitySchedulerFigure);

			fFigureSlaveCompartmentFigure = new RectangleFigure();

			GridData constraintFFigureSlaveCompartmentFigure = new GridData();
			constraintFFigureSlaveCompartmentFigure.verticalAlignment = GridData.FILL;
			constraintFFigureSlaveCompartmentFigure.horizontalAlignment = GridData.FILL;
			constraintFFigureSlaveCompartmentFigure.horizontalIndent = 0;
			constraintFFigureSlaveCompartmentFigure.horizontalSpan = 1;
			constraintFFigureSlaveCompartmentFigure.verticalSpan = 1;
			constraintFFigureSlaveCompartmentFigure.grabExcessHorizontalSpace = true;
			constraintFFigureSlaveCompartmentFigure.grabExcessVerticalSpace = true;
			this.add(fFigureSlaveCompartmentFigure,
					constraintFFigureSlaveCompartmentFigure);

			GridLayout layoutFFigureSlaveCompartmentFigure = new GridLayout();
			layoutFFigureSlaveCompartmentFigure.numColumns = 1;
			layoutFFigureSlaveCompartmentFigure.makeColumnsEqualWidth = true;
			fFigureSlaveCompartmentFigure
					.setLayoutManager(layoutFFigureSlaveCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityNameFigure() {
			return fFigureActivityNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityCpuAffinityFigure() {
			return fFigureActivityCpuAffinityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityPeriodFigure() {
			return fFigureActivityPeriodFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivityPriorityFigure() {
			return fFigureActivityPriorityFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActivitySchedulerFigure() {
			return fFigureActivitySchedulerFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureSlaveCompartmentFigure() {
			return fFigureSlaveCompartmentFigure;
		}

	}

}
