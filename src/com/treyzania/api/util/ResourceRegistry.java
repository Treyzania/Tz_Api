package com.treyzania.api.util;

import com.treyzania.api.games.Environment2D;
import com.treyzania.api.gui.Theme;

public class ResourceRegistry {

	private static Theme currentTheme;
	private static Environment2D currentEnv;
	
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
	public static void setCurrentEnvironment(Environment2D env) {
		
		currentEnv = env;
		
	}
	
	/**
	 * Gets the current Environment.
	 * 
	 * @return
	 */
	public static Environment2D getCurrentEnvironment() {
		
		return currentEnv;
		
	}
	
}
