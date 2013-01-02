package com.treyzania.api;

import com.treyzania.api.FUN.FUN;
import com.treyzania.api.gui.Theme;
import com.treyzania.api.util.ResourceRegistry;

public class Tz_Api {

	public static void initalize() {
		
		ResourceRegistry.setCurrentTheme(Theme.THEME_DEFAULT);
		// TODO Add more classes to initialize.
		
	}
	
	public static void funify() {
		
		FUN.fun();
		
		
	}
	
	
}
