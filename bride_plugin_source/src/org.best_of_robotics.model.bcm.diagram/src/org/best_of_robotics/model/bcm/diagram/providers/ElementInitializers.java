package org.best_of_robotics.model.bcm.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}
}
