package org.ros.model.ros.diagram.part;

import java.util.List;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.EMFEditUIPlugin;
import org.eclipse.emf.edit.ui.action.CommandActionHandler;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;


public class PackageImportAction implements IObjectActionDelegate  {

	protected Command command;
	protected EObject eObject = null;
	
	@Override
	public void run(IAction action) {
		System.out.println("Hallo Pallo!");
		if (eObject == null)
			{
				System.out.println("No eObject selected");
				return;
			}
		Shell shell = new Shell();
		IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot(); 

		
		 TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
		    domain.setID("org.ros.model.ros_package.diagram.EditingDomain");
		ControlResourceDialog dialog = new ControlResourceDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), domain/*, eObject.eResource()*/);
		dialog.open();
		Resource res = dialog.getResource();
		System.out.println("Finished");

		if (res == null) return;
		System.out.println(res.toString());
		System.out.println(res.getContents().toString());
		//command = new AddCommand(domain, res.getContents(), eObject);
		
	}

	
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		
		// TODO Auto-generated method stub
		if(selection instanceof StructuredSelection){
			System.out.println("Yeah");
		}
		
		System.out.println("Hallo Pallo Selection!");
		if (selection.isEmpty()) return;
		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
	    domain.setID("org.ros.model.ros_package.diagram.EditingDomain");

	    EditingDomain dm = AdapterFactoryEditingDomain.getEditingDomainFor(selection);
	    System.out.println(dm.toString());
	    
	    Object object = AdapterFactoryEditingDomain.unwrap(selection);
	    
	    System.out.println(object.toString());
	    boolean result = domain.isControllable(object);
	    if(result)
	    	System.out.println("IsControllable");
	    eObject = result ? (EObject)object : null;
		
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * A save-type {@link ResourceDialog resource dialog} that attempts to create the specified resource and
	 * load it, if it already exists.
	 */
	protected static class ControlResourceDialog extends ResourceDialog
	{
	  protected EditingDomain domain;
	  protected Resource resource;
	  protected Resource currentResource;

	  public ControlResourceDialog(Shell parent, EditingDomain domain/*, Resource currentResource*/)
	  {
	    super(parent, EMFEditUIPlugin.INSTANCE.getString("_UI_ControlDialog_title"), SWT.SAVE);
	    this.domain = domain;
	    //this.currentResource = currentResource;
	  }

	  /**
	   * Creates and, if it already exists, loads the specified resource. This implementation verifies that a
	   * resource can be opened for that URI, that the resource is not the object's current container, and that
	   * it is not read-only in the editing domain. If there is an existing resource with that URI, it prompts
	   * before overriding or adding to it.
	   */
	  @Override
	  protected boolean processResources()
	  {
	    List<URI> uris = getURIs();
	    if (uris.isEmpty()) return false;

	    URI uri = uris.get(0);
	    ResourceSet resourceSet = domain.getResourceSet();
	    Resource resource = resourceSet.getResource(uri, false);
	    boolean resourceInSet = resource != null;

	    /*if (resource == currentResource)
	    {
	      MessageDialog.openError(getShell(), EMFEditUIPlugin.INSTANCE.getString("_UI_InvalidURI_label"), EMFEditUIPlugin.INSTANCE.getString("_WARN_AlreadyInResource"));
	      return false;        
	    }*/
	    if (domain.isReadOnly(resource))
	    {
	      MessageDialog.openError(getShell(), EMFEditUIPlugin.INSTANCE.getString("_UI_InvalidURI_label"), EMFEditUIPlugin.INSTANCE.getString("_WARN_ReadOnlyResource"));
	      return false;                
	    }

	    boolean resourceExists = resourceSet.getURIConverter().exists(uri, null);

	    boolean resourceBad = false;
	    if (!resourceInSet)
	    {
	      resource = resourceSet.createResource(uri);
	      if (resource == null)
	      {
	        MessageDialog.openError(getShell(), EMFEditUIPlugin.INSTANCE.getString("_UI_InvalidURI_label"), EMFEditUIPlugin.INSTANCE.getString("_WARN_CannotCreateResource"));
	        return false;
	      }

	      if (resourceExists)
	      {
	        try
	        {
	          resource = resourceSet.getResource(uri, true);
	        }
	        catch (RuntimeException exception)
	        {
	          EMFEditUIPlugin.INSTANCE.log(exception);
	          resourceBad = resource.getContents().isEmpty();            
	        }
	      }
	    }

	    boolean result = true;
	    if (resourceBad)
	    {
	      result = MessageDialog.openQuestion(getShell(), EMFEditUIPlugin.INSTANCE.getString("_UI_ExistingResource_label"), EMFEditUIPlugin.INSTANCE.getString("_WARN_ReplaceResource"));
	    }
	    else if (resourceExists)
	    {
	      result = MessageDialog.openQuestion(getShell(), EMFEditUIPlugin.INSTANCE.getString("_UI_ExistingResource_label"), EMFEditUIPlugin.INSTANCE.getString("_WARN_AddToResource"));
	    }

	    if (!result && !resourceInSet && resource != null)
	    {
	      resource.unload();
	      resourceSet.getResources().remove(resource);
	    }
	    else
	    {
	      this.resource = resource;
	    }
	    return result;
	  }

	  public Resource getResource()
	  {
	   return resource; 
	  }
	}
	
}
