package org.ros.model.ros.diagram;

import java.util.ArrayList;
import java.util.List;

import org.best_of_robotics.model.datatypes.DataType;
import org.best_of_robotics.model.datatypes.DatatypesFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramDropTargetListener;
import org.eclipse.swt.dnd.Transfer;
import org.ros.model.ros.RosFactory;
import org.ros.model.ros.RosPackage;
import org.ros.model.ros.impl.RosPackageImpl;

public class GmfDropListener extends DiagramDropTargetListener{
	
	
	public GmfDropListener(EditPartViewer viewer, Transfer xfer) {    
        super(viewer, xfer);            
    }    
    
    @Override    
    protected void handleDragOver() {    
        updateTargetRequest();    
        updateTargetEditPart();    
        showTargetFeedback();    
    }    
    
    @Override    
    protected List getObjectsBeingDropped() {
    	String s = getCurrentEvent().toString();
    	System.out.println("Dropped: " + s );
    	/*if(((String[])getCurrentEvent().data).length != 0)
    		System.out.println("Filename: " + ((String[])getCurrentEvent().data)[0]);
    		*/
        List a = new ArrayList<String>();
        org.ros.model.ros.Package test = RosFactory.eINSTANCE.createPackage();
        test.setName("Bubi_was_here");
        test.setAuthor("Alexander Bubeck");
        a.add(test); // Job is the model class of my figure node  
        return a;    
    }    

}
