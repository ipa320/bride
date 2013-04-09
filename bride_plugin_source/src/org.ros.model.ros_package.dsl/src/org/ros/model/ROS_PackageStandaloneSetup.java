
package org.ros.model;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ROS_PackageStandaloneSetup extends ROS_PackageStandaloneSetupGenerated{

	public static void doSetup() {
		new ROS_PackageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

