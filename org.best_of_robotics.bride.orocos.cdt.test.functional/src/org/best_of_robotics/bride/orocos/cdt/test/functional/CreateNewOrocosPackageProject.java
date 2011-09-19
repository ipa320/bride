/**
 * 
 */
package org.best_of_robotics.bride.orocos.cdt.test.functional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author hugo
 *
 */
@RunWith(SWTBotJunit4ClassRunner.class)
public class CreateNewOrocosPackageProject {
	
	private static final String PROJECT_NAME = "AnOrocosPakageProect";
	private static SWTWorkbenchBot bot;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		SWTBotPreferences.PLAYBACK_DELAY = 20;
		
		bot = new SWTWorkbenchBot();
		bot.viewByTitle("Welcome").close();
		
		// Change the perspective via the Open Perspective dialog       
		bot.menu("Window").menu("Open Perspective").menu("Other...").click();
		SWTBotShell openPerspectiveShell = bot.shell("Open Perspective");
		openPerspectiveShell.activate();
		 
		// select the dialog
		bot.table().select("C/C++");
		bot.button("OK").click();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//bot.sleep(2000);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws Throwable 
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		bot.menu("File").menu("New").menu("Project...").click();
		 
		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		bot.tree().expandNode("C/C++").select("C++ Project");
		bot.button("Next >").click();
 
		bot.textWithLabel("Project name:").setText(PROJECT_NAME);
		bot.treeWithLabel("Project type:").expandNode("Makefile project").select("Orocos Package");
		bot.tableWithLabel("Toolchains:").select("Linux GCC");
		bot.button("Finish").click();
		
		String sourceFolder = "src";
		String modelFolder = "model";
		String deploymentFolder = "deployment";
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(PROJECT_NAME);
		assertTrue(project.isAccessible());
		
		IResource sourceFolderResource = project.findMember(sourceFolder);
		assertNotNull(sourceFolderResource);
		
		IResource modelFolderResource = project.findMember(modelFolder);
		assertNotNull(modelFolderResource);
		
		IResource deploymentFolderResource = project.findMember(deploymentFolder);
		assertNotNull(deploymentFolderResource);
	}

}
