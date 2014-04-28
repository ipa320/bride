package org.ros.model.ros_package.diagram.providers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.ros.model.ros.Parameter;

/**
 * @generated
 */
public class RosValidationProvider {

	/**
	 * @generated
	 */
	private static boolean constraintsActive = false;

	/**
	 * @generated
	 */
	public static boolean shouldConstraintsBePrivate() {
		return false;
	}

	/**
	 * @generated
	 */
	public static void runWithConstraints(
			TransactionalEditingDomain editingDomain, Runnable operation) {
		final Runnable op = operation;
		Runnable task = new Runnable() {
			public void run() {
				try {
					constraintsActive = true;
					op.run();
				} finally {
					constraintsActive = false;
				}
			}
		};
		if (editingDomain != null) {
			try {
				editingDomain.runExclusive(task);
			} catch (Exception e) {
				org.ros.model.ros_package.diagram.part.RosDiagramEditorPlugin
						.getInstance().logError("Validation failed", e); //$NON-NLS-1$
			}
		} else {
			task.run();
		}
	}

	/**
	 * @generated
	 */
	static boolean isInDefaultEditorContext(Object object) {
		if (shouldConstraintsBePrivate() && !constraintsActive) {
			return false;
		}
		if (object instanceof View) {
			return constraintsActive
					&& org.ros.model.ros_package.diagram.edit.parts.PackageEditPart.MODEL_ID
							.equals(org.ros.model.ros_package.diagram.part.RosVisualIDRegistry
									.getModelID((View) object));
		}
		return true;
	}

	/**
	 * @generated
	 */
	public static class DefaultCtx implements IClientSelector {

		/**
		 * @generated
		 */
		public boolean selects(Object object) {
			return isInDefaultEditorContext(object);
		}
	}

	/**
	 * @generated
	 */
	public static class Adapter19 extends AbstractModelConstraint {

		/**
		 * @not generated
		 */
		public IStatus validate(IValidationContext ctx) {
			Parameter context = (Parameter) ctx.getTarget();
			if (context.getType().getValue() == 4)
				return ctx.createSuccessStatus();
			else
			{
				if(context.getValue().length() > 0)
					return ctx.createSuccessStatus();
				else
					return ctx.createFailureStatus(context);
			}
			// TODO: put validation code here
			// Ensure that you remove @generated tag or use @generated NOT
			//
			// To construct approprate return value, use ctx.createSuccessStatus()
			// or ctx.createFailureStatus(...)
			//throw new UnsupportedOperationException(
			//		"No user java implementation provided for #validate(IValidationContext) operation"); //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	static String formatElement(EObject object) {
		return EMFCoreUtil.getQualifiedName(object, true);
	}

}
