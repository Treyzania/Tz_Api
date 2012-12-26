package com.treyzania.api.util;

import java.util.ArrayList;
import java.util.EventListener;

import com.treyzania.api.games.GPanel2D;

public class EventRegistry {

	private static ArrayList<GPanel2D> panels = new ArrayList<GPanel2D>();
	private static ArrayList<EventListener> listeners = new ArrayList<EventListener>();
	
	public static void registerTarget(EventListener l) {
		
		synchronized (EventRegistry.class) {
			
			for ( GPanel2D gp2d : panels ) {
				gp2d.tz_addGenericListener(l);
			}
			
			listeners.add(l);
			
		}
		
	}
	
	public static void registerGPanel2D(GPanel2D gp2d) {
		
		synchronized (EventRegistry.class) {
			
			panels.add(gp2d);
			
			for ( EventListener l : listeners ) {
				gp2d.tz_addGenericListener(l);
			}
			
		}
		
	}
	
}
