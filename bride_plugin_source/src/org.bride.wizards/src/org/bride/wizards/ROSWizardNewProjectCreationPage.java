package org.bride.wizards;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;

public class ROSWizardNewProjectCreationPage extends WizardNewProjectCreationPage {

	public ROSWizardNewProjectCreationPage(String pageName) {
		super(pageName);
	}
	
	protected boolean validatePage() {
		if(super.validatePage() == false)
			return false;
		else
		{
			if(this.useDefaults() == false)
			{
				if(!(this.getProjectName().equals(this.getLocationPath().lastSegment())))
				{
					setErrorMessage(null);
		            setMessage("Location should have the same name as ROS package");
		            return false;
				}
			}
			return true;
		}
	}

	
}
