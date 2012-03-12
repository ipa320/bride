package org.best_of_robotics.bride.ui.preference;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class WorkbenchPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	public WorkbenchPreferencePage() {
		setDescription("See the subpages for specific preferences.");
	}

	@Override
	public void init(IWorkbench workbench) {

	}

	@Override
	protected Control createContents(Composite parent) {
		parent.setLayout(new GridLayout());
		Composite child = new Composite(parent, SWT.NONE);
		child.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		return parent;
	}

}
