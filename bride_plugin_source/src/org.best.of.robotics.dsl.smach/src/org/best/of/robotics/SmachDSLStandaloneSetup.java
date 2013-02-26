
package org.best.of.robotics;


/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SmachDSLStandaloneSetup extends SmachDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new SmachDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

