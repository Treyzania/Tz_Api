package com.treyzania.api.util;

import java.util.logging.Logger;

import com.treyzania.api.gui.Theme;

public class ResourceRegistry {

	private static Theme currentTheme;
	public static Logger masterLogger;
	
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
	
}
