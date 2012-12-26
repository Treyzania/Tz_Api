package com.treyzania.api.util;

import com.treyzania.api.games.Environment;
import com.treyzania.api.gui.Theme;

public class ResourceRegistry {

	private static Theme currentTheme;
	private static Environment currentEnv;
	
	/**
	 * Sets the current Theme.
	 * 
	 * @param theme
	 */
	public static void setCurrentTheme(Theme theme) {
		
		currentTheme = theme;
		
	}
	
	/**
	 * Gets the current Theme.
	 * 
	 * @return
	 */
	public static Theme getCurrentTheme() {
		
		return currentTheme;
		
	}
	
	/**
	 * Sets the current Environment.
	 * 
	 * @param env
	 */
	public static void setCurrentEnvironment(Environment env) {
		
		currentEnv = env;
		
	}
	
	/**
	 * Gets the current Environment.
	 * 
	 * @return
	 */
	public static Environment getCurrentEnvironment() {
		
		return currentEnv;
		
	}
	
}
