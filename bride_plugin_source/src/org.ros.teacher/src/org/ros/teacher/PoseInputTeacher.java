package org.ros.teacher;

import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.yaml.snakeyaml.Yaml;

public class PoseInputTeacher implements TeacherPlugin {
	private Group ebar;
	private Text ib_frame_id;
	private Text ib_posx;
	private Text ib_posy;
	private Text ib_posz;
	private Text ib_rotr;
	private Text ib_rotp;
	private Text ib_roty;
	double roll, pitch, yaw;
	
	@Override
	public String getType() {
		return "{header: {seq: 0, stamp: {secs: 0, nsecs: 0}, frame_id: ''}, pose: {position: {x: 0.0, y: 0.0, z: 0.0}, orientation: {x: 0.0, y: 0.0, z: 0.0, w: 0.0}}}";
	}

	@Override
	public String getGUIData(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int getGimbalPole(double x, double y, double z, double w) {
		final double t = y*x+z*w;
		return t > 0.499f ? 1 : (t < -0.499f ? -1 : 0);
	}
	
	public void quaternion_to_euler(double x, double y, double z, double w) 
	{	
		final int pole = getGimbalPole(x,y,z,w);
		roll = pole == 0 ? Math.atan2(2f*(w*z + y*x), 1f - 2f * (x*x + z*z)) : (double)pole * 2f * Math.atan2(y, w);
		pitch = pole == 0 ? (double)Math.asin(2f*(w*x-z*y)) : (double)pole * Math.PI * 0.5f;
		yaw = pole == 0 ? Math.atan2(2f*(y*w + x*z), 1f - 2f*(y*y+x*x)) : 0f;	
	}

	@Override
	public Widget getGUIWidget(Composite parent, String name, String current_data) {
		Yaml yaml = new Yaml();
		Object parsed_current_data = yaml.load(current_data);
		System.out.println("current_data: " + parsed_current_data);
		double qx = ((Double)((Map) ((Map) ((Map)parsed_current_data).get("pose")).get("orientation")).get("x")).doubleValue();
		double qy = ((Double)((Map) ((Map) ((Map)parsed_current_data).get("pose")).get("orientation")).get("y")).doubleValue();
		double qz = ((Double)((Map) ((Map) ((Map)parsed_current_data).get("pose")).get("orientation")).get("z")).doubleValue();
		double qw = ((Double)((Map) ((Map) ((Map)parsed_current_data).get("pose")).get("orientation")).get("w")).doubleValue();
		quaternion_to_euler(qx, qy, qz, qw);
		
		ebar = new Group(parent, SWT.PUSH);
		GridLayout layout = new GridLayout ();
		layout.marginLeft = layout.marginTop = layout.marginRight = layout.marginBottom = 4;
		layout.verticalSpacing = 4;
		layout.numColumns = 4;
		ebar.setLayout(layout);
		
		Label lb_frame_id = new Label(ebar, SWT.PUSH);
		lb_frame_id.setText("frame_id: ");
		ib_frame_id = new Text(ebar, SWT.PUSH);
		ib_frame_id.setEditable(true);
		ib_frame_id.setText((String) ((Map) ((Map)parsed_current_data).get("header")).get("frame_id"));
		Label lb_empty1 = new Label(ebar, SWT.PUSH);
		Label lb_empty2 = new Label(ebar, SWT.PUSH);
		
		Label lb_posx = new Label(ebar, SWT.PUSH);
		lb_posx.setText("Position X: ");
		ib_posx = new Text(ebar, SWT.PUSH);
		ib_posx.setEditable(true);
		ib_posx.setText( ((Map) ((Map) ((Map)parsed_current_data).get("pose")).get("position")).get("x").toString());
		
		Label lb_rotr = new Label(ebar, SWT.PUSH);
		lb_rotr.setText("Rotation R: ");
		ib_rotr = new Text(ebar, SWT.PUSH);
		ib_rotr.setEditable(true);
		ib_rotr.setText(Double.toString(roll));
		
		Label lb_posy = new Label(ebar, SWT.PUSH);
		lb_posy.setText("Position Y: ");
		ib_posy = new Text(ebar, SWT.PUSH);
		ib_posy.setEditable(true);
		ib_posy.setText(((Map) ((Map) ((Map)parsed_current_data).get("pose")).get("position")).get("y").toString());
		
		Label lb_rotp = new Label(ebar, SWT.PUSH);
		lb_rotp.setText("Rotation P: ");
		ib_rotp = new Text(ebar, SWT.PUSH);
		ib_rotp.setEditable(true);
		ib_rotp.setText(Double.toString(pitch));
		
		Label lb_posz = new Label(ebar, SWT.PUSH);
		lb_posz.setText("Position Z: ");
		ib_posz = new Text(ebar, SWT.PUSH);
		ib_posz.setEditable(true);
		ib_posz.setText( ((Map) ((Map) ((Map)parsed_current_data).get("pose")).get("position")).get("z").toString());
		
		Label lb_roty = new Label(ebar, SWT.PUSH);
		lb_roty.setText("Rotation Y: ");
		ib_roty = new Text(ebar, SWT.PUSH);
		ib_roty.setEditable(true);
		ib_roty.setText(Double.toString(yaw));
		
		ebar.setText("Teacher: " + name + "___________________________________________");
		ebar.pack();
		//ExpandItem item0 = new ExpandItem (ebar, SWT.NONE, 0);
		//item0.setText("Teacher: " + name + "___________________________________________");
		//item0.setHeight(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		//item0.setControl(composite);
		//item0.setExpanded(true);
		//ebar.setSpacing(4);
		return ebar;
	}

	@Override
	public String getName() {
		return "PoseInputTeacher";
	}

}
