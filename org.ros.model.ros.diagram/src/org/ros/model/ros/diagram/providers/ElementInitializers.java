package org.ros.model.ros.diagram.providers;

import org.ros.model.ros.diagram.part.RosDiagramEditorPlugin;

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
		ElementInitializers cached = RosDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			RosDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
