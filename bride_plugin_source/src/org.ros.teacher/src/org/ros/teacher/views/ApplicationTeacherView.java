package org.ros.teacher.views;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.ros.teacher.*;
import org.yaml.snakeyaml.Yaml;

/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class ApplicationTeacherView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.ros.teacher.views.ApplicationTeacherView";

	private TableViewer viewer;
	private GridLayout gl;
	private Action action1;
	private Action action2;
	private Action doubleClickAction;
	
	private TeacherPlugin teacher0;
	private TeacherPlugin teacher1;
	private TeacherPlugin teacher2;
	
	List<TeacherPlugin> available_teachers;

	
	public ApplicationTeacherView() {
		available_teachers = new ArrayList<TeacherPlugin>();
		available_teachers.add(new StringInputTeacher());
		available_teachers.add(new FloatInputTeacher());
		available_teachers.add(new PoseInputTeacher());
		
	}


	public boolean compareMapKeys(Map map1, Map map2)
	{
		boolean equals = true;
		if(map1.keySet().equals(map2.keySet()))
		{
			//System.out.println("	Matched: " + map1.keySet().toString());
			for(Object key1:map1.keySet())
			{
				if(map1.get(key1).getClass().getName().toString() == "java.util.LinkedHashMap")
				{
					//System.out.println("Found Map for " + key1.toString());
					for(Object key2:map2.keySet())
					{
						//System.out.println(key2.toString());
						if(key1.toString().equals(key2.toString()))
						{
							//System.out.println("Found " + map2.get(key2).getClass().getName().toString() + " for " + key2.toString());
							if(map2.get(key2).getClass().getName().toString() == "java.util.LinkedHashMap")
								equals = compareMapKeys((Map)map1.get(key1), (Map)map2.get(key2));
							else
								return false;
						}
					}
				}
				else
					equals = true;
			}
		}
		else
		{
			return false;
		}
		return equals;
	}
	
	public void parseConfigFile(Composite parent)
	{
		
		Yaml yaml = new Yaml();
		InputStream input;
		try {
			
			String jointstateyaml = "{header: {seq: 0, stamp: {secs: 0, nsecs: 0}, frame_id: ''}, name: [''], position: [0], velocity: [0], effort: [0]}";
			input = new FileInputStream(new File("/home/aub/git/bride/src/cob_teacher/src/MoveHomePTP_goal.yaml"));
			Map map = (Map) yaml.load(input);
			for(Object key : map.keySet()){
				if(map.get(key).getClass().getName().toString() == "java.util.LinkedHashMap")
				{
					//complex type
					for(TeacherPlugin teacher:available_teachers){
						Object teachermap = yaml.load(teacher.getType());
						if(teachermap.getClass().getName().toString() == "java.util.LinkedHashMap")
						{
							if(compareMapKeys((Map)map.get(key), (Map)teachermap))
							{
								System.out.println("Found teacher for complex type: " + map.get(key).toString());
								System.out.println("Teacher map: " + ((Map)teachermap).keySet().toString());
								Class<?> c = Class.forName(teacher.getClass().getName());
								Constructor<?> cons = c.getConstructor();
								TeacherPlugin newteacher = (TeacherPlugin) cons.newInstance();
								newteacher.getGUIWidget(parent, key.toString(), yaml.dump(map.get(key)));
							}
						}
					}
				}
				else{
					for(TeacherPlugin teacher:available_teachers){
						if(map.get(key).getClass().getName().toString() == teacher.getType())
						{
							System.out.println("Found teacher for " + key.toString() + "of type " + teacher.getType());
							Class<?> c = Class.forName(teacher.getClass().getName());
							Constructor<?> cons = c.getConstructor();
							TeacherPlugin newteacher = (TeacherPlugin) cons.newInstance();
							GridData data = new GridData(GridData.FILL_BOTH);
						    data.widthHint = 200;
							newteacher.getGUIWidget(parent, key.toString(), map.get(key).toString());
						
						}						
					}
				}
				System.out.println("===============\n" + key.toString() + " of type " +  map.get(key).getClass().getName().toString());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	public void createPartControl(Composite parent) {
		GridLayout layout = new GridLayout ();
		layout.numColumns = 1;
		parent.setLayout(layout);
		parseConfigFile(parent);
	
		

		// Create the help context id for the viewer's control
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "org.ros.teacher.viewer");
		//makeActions();
		//hookContextMenu();
		//hookDoubleClickAction();
		//contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ApplicationTeacherView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(action1);
		manager.add(new Separator());
		manager.add(action2);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(action1);
		manager.add(action2);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(action1);
		manager.add(action2);
	}

	private void makeActions() {
		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"ApplicationTeacher View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
}