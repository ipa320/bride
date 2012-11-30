package org.ros.model.ros.diagram;

import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.AbstractEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.diagram.part.RosDiagramEditorPlugin;
import org.ros.model.ros.diagram.providers.RosElementTypes;
import org.ros.model.ros.impl.RosPackageImpl;
import org.eclipse.emf.edit.command.AddCommand;


public class DropObjectEditPolicy extends DiagramDragDropEditPolicy {

	@Override  
    protected Command createViewsAndArrangeCommand(  
            DropObjectsRequest dropRequest, List viewDescriptors) {  
        CompoundCommand cm = new CompoundCommand();  
        Iterator elements = dropRequest.getObjects().iterator();  
        while (elements.hasNext()) {  
            Object obj = elements.next();  
            if (obj instanceof EObject) {  
                Command cmd = getDropElementCommand((EObject)obj, dropRequest);  
                if (cmd != null)  
                {
                	cm.add(cmd);
                }
                    
//                SetRequest reqSet = new SetRequest(((IGraphicalEditPart) getHost()).getEditingDomain(), (EObject)obj, RosPackage.eINSTANCE.getPackage_Name(), "Test14");
//                
//                SetValueCommand operation = new SetValueCommand(reqSet);
//                
//                Command cmd2 = new ICommandProxy(operation);
//                if (cmd2 != null)
//                	cm.add(cmd2);
            }  
        }
        
        
        
        return cm;  
    }  
  
      
    protected Command getDropElementCommand(EObject element,    
            DropObjectsRequest request) {    
    
    	System.out.println("Objects: " + request.getObjects().toString());
        System.out.println("Element: " + element.toString());
        
            
        IElementType type = RosElementTypes.Package_2001;
        
        TransactionalEditingDomain domain = ((IGraphicalEditPart) getHost()).getEditingDomain();
	    ResourceSet resourceSet = domain.getResourceSet();
	    resourceSet.getResource(URI.createURI("platform:/resource/test/model/default.ros_package"), false);
	    Resource res = resourceSet.getResource(URI.createURI("platform:/resource/test/model/default.ros_package"), true);
	    
        System.out.println("Resource: " + res.toString());
        System.out.println("res.getContents(): " + res.getContents().toString());

	    		      
                
        CreateElementRequest cer = new CreateElementRequest(type);
        
       // RosPackageImpl mypackage = new RosPackageImpl();
        //mypackage.setName("HalloPallo");
        
        //cer.setContainer(((View) getHost().getModel()).getElement());
        //cer.setNewElement(mypackage);
        
        
        if(res.getContents().size() != 0)
        {
        	System.out.println("Creating Link");
        	//org.eclipse.emf.common.command.Command c4 = new AddCommand(domain, res.getContents(), mypackage);
        	//domain.getCommandStack().execute(c4);
        }
        else
        {
        	System.out.println("ResourceSet Content empty");
        }
        
        System.out.println("Request: " + cer.toString());
        
          
        ViewAndElementDescriptor viewDescriptor = new ViewAndElementDescriptor(    
                new CreateElementRequestAdapter(cer), Node.class,    
                ((IHintedType) type).getSemanticHint(),    
                RosDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);    
    
        CreateViewAndElementRequest req = new CreateViewAndElementRequest(viewDescriptor);    
        System.out.println("Location: " + request.getLocation().toString());
        
        
        req.setLocation(request.getLocation());    
        Command c = getHost().getCommand(req);
        
        
        return c;    
    }  
	
}
