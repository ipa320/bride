package org.best_of_robotics.transform.ros.to.cplusplus.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.epsilon.eol.execute.context.Variable;
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
	    this.directory = directory;
	  }
	  
	  public String getDirectory() {
	    return directory;
	  }
  
  public void chmod(String rights)
  {
	  try {
			Runtime.getRuntime().exec("chmod " + rights + " " + directory + "/cfg/" + filename + ".cfg");
		} catch (IOException e) {
			e.printStackTrace();
		} 
  }
	  
  
}
