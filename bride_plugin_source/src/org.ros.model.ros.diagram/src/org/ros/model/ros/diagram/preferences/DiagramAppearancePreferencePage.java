package org.ros.model.ros.diagram.preferences;

import org.eclipse.gmf.runtime.diagram.ui.preferences.AppearancePreferencePage;
import org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.ros.model.ros.diagram.part.RosDiagramEditorPlugin;

/**
 * @generated
 */
public class DiagramAppearancePreferencePage extends AppearancePreferencePage {

	/**
	 * @generated NOT
	 */
	public DiagramAppearancePreferencePage() {
		IPreferenceStore store = RosDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
		setPreferenceStore(store);
		FontData defaultFont = new FontData("Droid", 7, SWT.NONE);
		PreferenceConverter.setDefault(store,
				IPreferenceConstants.PREF_DEFAULT_FONT, defaultFont);
	}
}
