package org.ros.teacher;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;

public class FloatInputTeacher implements TeacherPlugin {
	private Group ebar;
	private Text inputbox;
	
	@Override
	public String getType() {
		return "java.lang.Double";
	}

	@Override
	public String getGUIData(String name) {
		return inputbox.getText();
	}

	@Override
	public Widget getGUIWidget(Composite parent, String name,
			String current_data) {
		ebar = new Group(parent, SWT.PUSH);
		GridLayout layout = new GridLayout ();
		layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 4;
		layout.verticalSpacing = 4;
		ebar.setLayout(layout);
		inputbox = new Text(ebar, SWT.PUSH);
		inputbox.setText(current_data);
		inputbox.setEditable(true);
		ebar.setText("Teacher: " + name);
		return ebar;
	}

	@Override
	public String getName() {
		return "FloatInputTeacher";
	}

}
