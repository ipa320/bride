package org.ros.model.ros.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.ros.model.ros.RosPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.CreateCopyCommand;
import org.eclipse.emf.edit.command.ReplaceCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.ros.model.ros.diagram.providers.RosElementTypes;

/**
 * @generated
 */
public class RosBaseEditHelper extends GeneratedEditHelperBase {
	@Override
	protected ICommand getConfigureCommand(ConfigureRequest req) {

		return null;
	}

	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {

		return super.getCreateCommand(req);
	}
}
