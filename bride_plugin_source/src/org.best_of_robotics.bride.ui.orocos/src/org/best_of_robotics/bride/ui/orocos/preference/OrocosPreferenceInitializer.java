package org.best_of_robotics.bride.ui.orocos.preference;

import org.best_of_robotics.bride.ui.orocos.Activator;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class OrocosPreferenceInitializer extends AbstractPreferenceInitializer {

	public OrocosPreferenceInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault("Generated Typekit", "typekit");
	}

}
