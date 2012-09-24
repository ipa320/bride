package org.ros.model.ros.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.EditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramDropTargetListener;
import org.eclipse.swt.dnd.Transfer;
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
//        a.add(new RosPackageImpl()); // Job is the model class of my figure node  
        return a;    
    }    

}
