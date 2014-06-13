package org.ros.teacher;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Widget;

public interface TeacherPlugin {
	public String getType();
	
	public String getGUIData(String name);
	
	public Widget getGUIWidget(Composite parent, String name, String current_data);
	
	public String getName();
	
}