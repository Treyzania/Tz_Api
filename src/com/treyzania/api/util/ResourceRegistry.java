package com.treyzania.api.util;

import com.treyzania.api.gfx.Theme;

public class ResourceRegistry {

	public static Theme currentTheme;
	private static TickRegistry ticker = new TickRegistry();
	
	// Gets the tick registry
	public static TickRegistry tickReg() {
		
		return ticker;
		
	}
	
	// Sets the color Theme
	public static void setCurrentTheme(Theme theme) {
		
		currentTheme = theme;
		
	}
	
}
