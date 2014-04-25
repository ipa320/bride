package org.bride.wizards;

import java.io.File;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.PixelConverter;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;


public class ROSWizardResourceImportPage extends WizardPage {

	private Text directoryPathField;
	private static String previouslyBrowsedDirectory = ""; //$NON-NLS-1$

	protected ROSWizardResourceImportPage(String name,
			IStructuredSelection selection) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public String getCurrentPath()
	{
		return directoryPathField.getText();
	}

	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite workArea = new Composite(parent, SWT.NONE);
		setControl(workArea);

		workArea.setLayout(new GridLayout());
		workArea.setLayoutData(new GridData(GridData.FILL_BOTH
				| GridData.GRAB_HORIZONTAL | GridData.GRAB_VERTICAL));

		createProjectsRoot(workArea);
		//createProjectsList(workArea);

		//createWorkingSetGroup(workArea);

		Dialog.applyDialogFont(workArea);

	}
	
	private void createProjectsRoot(Composite workArea) {
		Composite projectGroup = new Composite(workArea, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.makeColumnsEqualWidth = false;
		layout.marginWidth = 0;
		projectGroup.setLayout(layout);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		// project location entry field
		this.directoryPathField = new Text(projectGroup, SWT.BORDER);

		GridData directoryPathData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		directoryPathData.widthHint = new PixelConverter(directoryPathField).convertWidthInCharsToPixels(25);
		directoryPathField.setLayoutData(directoryPathData);
		
		// browse button
		Button browseDirectoriesButton = new Button(projectGroup, SWT.PUSH);
		browseDirectoriesButton.setText(DataTransferMessages.DataTransfer_browse);
		browseDirectoriesButton.addSelectionListener(new SelectionAdapter() {
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetS
			 * elected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				handleLocationDirectoryButtonPressed();
			}

		});
		
	}
	
	/**
	 * The browse button has been selected. Select the location.
	 */
	protected void handleLocationDirectoryButtonPressed() {

		DirectoryDialog dialog = new DirectoryDialog(directoryPathField
				.getShell(), SWT.SHEET);
		dialog
				.setMessage(DataTransferMessages.WizardProjectsImportPage_SelectDialogTitle);

		String dirName = directoryPathField.getText().trim();
		if (dirName.length() == 0) {
			dirName = previouslyBrowsedDirectory;
		}

		if (dirName.length() == 0) {
			dialog.setFilterPath(IDEWorkbenchPlugin.getPluginWorkspace()
					.getRoot().getLocation().toOSString());
		} else {
			File path = new File(dirName);
			if (path.exists()) {
				dialog.setFilterPath(new Path(dirName).toOSString());
			}
		}

		String selectedDirectory = dialog.open();
		if (selectedDirectory != null) {
			previouslyBrowsedDirectory = selectedDirectory;
			directoryPathField.setText(previouslyBrowsedDirectory);
			//updateProjectsList(selectedDirectory);
		}

	}
	
}