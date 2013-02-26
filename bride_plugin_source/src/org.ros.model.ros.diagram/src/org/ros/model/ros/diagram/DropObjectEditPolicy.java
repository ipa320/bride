package org.ros.model.ros.diagram;

import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.render.editparts.RenderedDiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.AbstractEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.ui.PlatformUI;
import org.ros.model.ros.RosFactory;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.diagram.part.RosDiagramEditorPlugin;
import org.ros.model.ros.diagram.providers.RosElementTypes;
import org.ros.model.ros.impl.RosPackageImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;

public class DropObjectEditPolicy extends DragDropEditPolicy  {


	/*@Override
	protected Command createViewsAndArrangeCommand(
			DropObjectsRequest dropRequest, List viewDescriptors) {
		CompoundCommand cm = new CompoundCommand();
		Iterator elements = dropRequest.getObjects().iterator();
		
		final DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		
		while (elements.hasNext()) {
			Object obj = elements.next();
			
			if (obj instanceof EObject) {
				//Command cmd = getDropElementCommand((EObject)obj, dropRequest);
				
				//creates the sketch element and set the image encoded as Base64
				//final org.ros.model.ros.Package pack = (org.ros.model.ros.Package) obj;
				*/
				
				/*SetRequest reqSet = new SetRequest(((IGraphicalEditPart) getHost()).getEditingDomain(), (EObject)obj, RosPackage.eINSTANCE.getPackage_Name(), "Test14");
				SetValueCommand operation = new SetValueCommand(reqSet);
				SetCommand setPoolNameCommand = new SetCommand(((IGraphicalEditPart) getHost()).getEditingDomain(), 
						(EObject)obj, RosPackage.eINSTANCE.getPackage_Name(), "Test14");
				//cmd2 = new ICommandProxy(operation);
	            if (setPoolNameCommand != null)
	            	cm.add(setPoolNameCommand);*/
/*				Command c = new Command(){
					@Override
					public void execute() {
					AbstractEMFOperation emfOp = new AbstractEMFOperation(editor.getEditingDomain(), "Location setting") {

					@Override
					protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
					NodeImpl n = (NodeImpl)getHost().getParent().getModel();
					org.ros.model.ros.Architecture p = (org.ros.model.ros.Architecture) n.basicGetElement();
					p.getPackages().add(pack);

					return Status.OK_STATUS;
					}
					};

					try {
					OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
					} catch (ExecutionException e) {}
					}
					};
				cm.add(c);
				if (cmd != null)
					cm.add(cmd);
	            	
			}
		}
		return cm;
	}

	*/
	protected Command getDropObjectsCommand(DropObjectsRequest request) {  
  
		CompoundCommand command = null;
        //System.out.println("blub");
        final DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
        
        command = new CompoundCommand();
        
        final org.ros.model.ros.Package pack = RosFactory.eINSTANCE.createPackage();
		pack.eSet(RosPackage.Literals.PACKAGE__NAME,  "bubi_was_here");//Base64.encodeFromFile(f.getPath()));
		
		CreateElementRequest cer = new CreateElementRequest(RosElementTypes.Package_2001);
		cer.setContainer(((View) getHost().getModel()).getElement());
		cer.setNewElement(pack);
		ViewAndElementDescriptor viewDescriptor2 = new ViewAndElementDescriptor(  
                new CreateElementRequestAdapter(cer), Node.class,  
                ((IHintedType) RosElementTypes.Package_2001).getSemanticHint(),  
                RosDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

		CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
				new EObjectAdapter(pack), Node.class, ((IHintedType)RosElementTypes.Package_2001).getSemanticHint(), true,
				editor.getDiagramEditPart().getDiagramPreferencesHint());

		viewDescriptor.setPersisted(true);
		viewDescriptor2.setPersisted(true);
		
		

		CreateViewRequest createRequest = new CreateViewRequest(viewDescriptor);
		CreateViewAndElementRequest createRequest2 = new CreateViewAndElementRequest(viewDescriptor2);
		createRequest.setLocation(request.getLocation());
		createRequest2.setLocation(request.getLocation());
		
		AddCommand ac = new AddCommand(editor.getEditingDomain(), pack.eContents(), getHost().getParent().getModel());
		
		Command c = new Command(){
			@Override
			public void execute() {
			AbstractEMFOperation emfOp = new AbstractEMFOperation(editor.getEditingDomain(), "Location setting") {

			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				System.out.println("blublub");
				System.out.println(getHost().toString());
				System.out.println(getHost().getParent().toString());
				System.out.println(getHost().getModel().toString());
				System.out.println(((org.ros.model.ros.impl.PackageImpl)getHost().getParent().getModel()).toString());
				org.ros.model.ros.impl.PackageImpl n = (org.ros.model.ros.impl.PackageImpl)getHost().getParent().getModel();
				System.out.println("blublub2");
				//org.ros.model.ros.Architecture p = (org.ros.model.ros.Architecture) n.basicGetElement();
				System.out.println("blublub3");
				//p.getPackages().add(pack);
				System.out.println("blublub4");
				return Status.OK_STATUS;
			}
			};

			try {
			OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
			} catch (ExecutionException e) {System.out.println(e.getMessage());}
			}
			};
		//command.add(ac);
		//command.add(getHost().getCommand(createRequest));
		command.add(getHost().getCommand(createRequest2));
		
		return command;
        
        
        /*IElementType type =  RosElementTypes.Package_2001;
        CreateElementRequest cer = new CreateElementRequest(RosElementTypes.Package_2001);
        CreateElementRequest cer2 = new CreateElementRequest(type);  
        cer.setContainer(((View) getHost().getModel()).getElement());
        
        
        org.ros.model.ros.Package pack = (org.ros.model.ros.Package) element;
        
        System.out.println("Package: " + pack.getName());
        cer.setNewElement(pack);  
        
        ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(  
                new CreateElementRequestAdapter(cer), Node.class,  
                ((IHintedType) type).getSemanticHint(),  
                RosDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);  
  
        CreateViewAndElementRequest req = new CreateViewAndElementRequest(  
                viewDescriptor);  
        req.setLocation(request.getLocation());  
        Command c = getHost().getCommand(req);  
        return c;  */
    }
	
}
