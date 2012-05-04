package org.best_of_robotics.bride.ui.orocos.preference;

import org.best_of_robotics.bride.ui.orocos.Activator;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class OrocosPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public OrocosPreferencePage() {
		super(GRID);
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {
		addField(new RadioGroupFieldEditor("DatatypeGenerator",
				"Datatype Generator:", 1, new String[][] {
						{ "Generated Typekit", "typekit" },
						{ "TypeGen", "typegen" } }, getFieldEditorParent()));
	}

}
