package org.orocos.model.rtt.diagram.providers;

import org.orocos.model.rtt.Slave;
import org.orocos.model.rtt.diagram.part.RttDiagramEditorPlugin;

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
	public void init_Slave_3004(Slave instance) {
		try {
			instance.setName("SlaveActivity");
		} catch (RuntimeException e) {
			RttDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = RttDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			RttDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
