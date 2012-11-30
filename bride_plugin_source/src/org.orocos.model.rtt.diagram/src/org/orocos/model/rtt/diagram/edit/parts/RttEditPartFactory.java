package org.orocos.model.rtt.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.orocos.model.rtt.diagram.part.RttVisualIDRegistry;

/**
 * @generated
 */
public class RttEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RttVisualIDRegistry.getVisualID(view)) {

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case TaskContextEditPart.VISUAL_ID:
				return new TaskContextEditPart(view);

			case TaskContextNameEditPart.VISUAL_ID:
				return new TaskContextNameEditPart(view);

			case TaskContextNamespaceEditPart.VISUAL_ID:
				return new TaskContextNamespaceEditPart(view);

			case TaskContextTypeEditPart.VISUAL_ID:
				return new TaskContextTypeEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);

			case ActivityCpuAffinityEditPart.VISUAL_ID:
				return new ActivityCpuAffinityEditPart(view);

			case ActivityPeriodEditPart.VISUAL_ID:
				return new ActivityPeriodEditPart(view);

			case ActivityPriorityEditPart.VISUAL_ID:
				return new ActivityPriorityEditPart(view);

			case ActivitySchedulerEditPart.VISUAL_ID:
				return new ActivitySchedulerEditPart(view);

			case OutputPortEditPart.VISUAL_ID:
				return new OutputPortEditPart(view);

			case OutputPortNameEditPart.VISUAL_ID:
				return new OutputPortNameEditPart(view);

			case OutputPortTypeEditPart.VISUAL_ID:
				return new OutputPortTypeEditPart(view);

			case InputPortEditPart.VISUAL_ID:
				return new InputPortEditPart(view);

			case InputPortNameEditPart.VISUAL_ID:
				return new InputPortNameEditPart(view);

			case InputPortTypeEditPart.VISUAL_ID:
				return new InputPortTypeEditPart(view);

			case InputPortIsEventPortEditPart.VISUAL_ID:
				return new InputPortIsEventPortEditPart(view);

			case PropertyEditPart.VISUAL_ID:
				return new PropertyEditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case SlaveEditPart.VISUAL_ID:
				return new SlaveEditPart(view);

			case SlaveNameEditPart.VISUAL_ID:
				return new SlaveNameEditPart(view);

			case TaskContextPropertiesEditPart.VISUAL_ID:
				return new TaskContextPropertiesEditPart(view);

			case TaskContextOperationsEditPart.VISUAL_ID:
				return new TaskContextOperationsEditPart(view);

			case ActivitySlavesEditPart.VISUAL_ID:
				return new ActivitySlavesEditPart(view);

			case ConnectionPolicyEditPart.VISUAL_ID:
				return new ConnectionPolicyEditPart(view);

			case ConnectionPolicyNameEditPart.VISUAL_ID:
				return new ConnectionPolicyNameEditPart(view);

			case IActivityTaskContextEditPart.VISUAL_ID:
				return new IActivityTaskContextEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
