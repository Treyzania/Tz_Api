package com.treyzania.api.util;

import com.treyzania.api.gfx.Theme;

public class ResourceRegistry {

	public static Theme currentTheme;
	
	// Sets the color Theme
	public static void setCurrentTheme(Theme theme) {
		
		currentTheme = theme;
		
	}
	
}
