package com.treyzania.api;

import com.treyzania.api.gui.Theme;
import com.treyzania.api.util.ResourceRegistry;

public class TzAPI {

	public static void initalize() {
		
		ResourceRegistry.setCurrentTheme(Theme.THEME_DEFAULT);
		ResourceRegistry.masterLogger = null; // TODO Add a logger.
		
		// TODO Add more classes to initialize.
		
	}
	
	private static String[] versionRaw() {
		
		return new String[] { "0", "0", "1" };
		
	}
	
	/**
	 * What is the version of the api?
	 * 
	 * @return
	 */
	public static String getAPIVersion() {
		String[] v = versionRaw();
		String ver = v[0];
		for (int i = 1; i < v.length; i++) { ver += ("." + v[i]); }
		return ver;
	}
	
	/**
	 * Check to see if the version of the API is what the implementation requires.
	 * 
	 * @param major The major version
	 * @param minor The minor version
	 * @param revision The revision number
	 * @return Whether or not the version is exact.
	 */
	public static boolean checkVersion(String major, String minor, String revision) {
		
		boolean perfect = false;
		String[] verRaw = versionRaw();
		
		if (verRaw[0] == major && verRaw[1] == minor && verRaw[2] == revision) {
			
			// TODO Version checking.
			
		}
		
		return perfect;
		
	}
	
}
