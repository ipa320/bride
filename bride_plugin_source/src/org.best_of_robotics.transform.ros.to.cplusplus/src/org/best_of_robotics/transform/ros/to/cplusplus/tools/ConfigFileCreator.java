package org.best_of_robotics.transform.ros.to.cplusplus.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.epsilon.eol.tools.AbstractTool;

public class ConfigFileCreator extends AbstractTool {
	protected String directory;
	private ArrayList<String> yaml_string = new ArrayList<String>();
  
  public void setDirectory(String directory) {
	    this.directory = directory.replace("file:", "");
	  }
  
  public ArrayList<String> getYaml(String type)
  {
	  Process pr;
	  	try {
		  	String cmd = "rosmsg-proto msg -H " + type.replace("::", "/");
		  	//System.out.println(cmd);
		  	pr = Runtime.getRuntime().exec(cmd);
			pr.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String temp;
			yaml_string.clear();
			while ((temp = buf.readLine()) != null) {
				yaml_string.add(temp);
			}
			//System.out.println(yaml_string.toString());
			return yaml_string;
	  	} catch (IOException e) {
			e.printStackTrace();
		} 
	  	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  	}
	  	return new ArrayList<String>();
  }
  
  public void write(String filename, String type)
  {
	File f = new File(directory+"/"+filename);
	if(f.exists()) {
		return;
	}
	FileWriter fstream = null;
	try {
		fstream = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(fstream);
		out.write("#Generated once for configuration of goals");
		out.newLine();
		out.write("#Config " + filename);
		out.newLine();
		Iterator<String> itr = getYaml(type).iterator();
		while (itr.hasNext()) {
			out.write(itr.next());
			out.newLine();
		}
		out.close();
		
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
  }
  

	  
  
}
