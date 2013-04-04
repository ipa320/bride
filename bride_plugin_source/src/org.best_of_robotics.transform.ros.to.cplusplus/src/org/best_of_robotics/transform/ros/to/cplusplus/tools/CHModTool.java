package org.best_of_robotics.transform.ros.to.cplusplus.tools;

import java.io.IOException;

import org.eclipse.epsilon.eol.tools.AbstractTool;

public class CHModTool extends AbstractTool {
  
  protected String filename;
  protected String directory;
  
  public void setName(String filename) {
    this.filename = filename;
  }
  
  public String getFileName() {
    return filename;
  }
  
  public void setDirectory(String directory) {
	    this.directory = directory.replace("file:", "");
	  }
	  
	  public String getDirectory() {
	    return directory;
	  }
  
  public void chmod(String rights)
  {
	  System.out.println("Running: " + "chmod " + rights + " " + directory + "/cfg/" + filename + ".cfg");
	  try {
			Runtime.getRuntime().exec("chmod " + rights + " " + directory + "/cfg/" + filename + ".cfg");
		} catch (IOException e) {
			e.printStackTrace();
		} 
  }
  
  public void chmod2(String rights)
  {
	  try {
			Runtime.getRuntime().exec("chmod " + rights + " " + directory + "/src/" + filename);
		} catch (IOException e) {
			e.printStackTrace();
		} 
  }
	  
  
}
