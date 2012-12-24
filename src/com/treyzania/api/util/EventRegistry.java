package com.treyzania.api.util;

import java.util.ArrayList;
import java.util.EventListener;

public class EventRegistry {

	protected static ArrayList<GPanel> panels = new ArrayList<GPanel>();
	
	public static void addTarget(EventListener l) {
		
		for ( GPanel gp : (GPanel[]) panels.toArray() ) {
			gp.tz_addListener(l);
		}
		
	}
	
}
