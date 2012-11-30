package org.best_of_robotics.model.bcm.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		org.best_of_robotics.model.bcm.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		org.best_of_robotics.model.bcm.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		org.best_of_robotics.model.bcm.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		org.best_of_robotics.model.bcm.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		org.best_of_robotics.model.bcm.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return org.best_of_robotics.model.bcm.diagram.part.BcmDiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
