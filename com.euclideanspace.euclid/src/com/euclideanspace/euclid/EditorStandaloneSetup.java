
package com.euclideanspace.euclid;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EditorStandaloneSetup extends EditorStandaloneSetupGenerated{

	public static void doSetup() {
		new EditorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

