package com.treyzania.api.games.games2d;

import java.util.ArrayList;
import java.util.EventListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import com.treyzania.api.util.ListenerRegistry;
import com.treyzania.api.util.ITick;
import com.treyzania.api.util.TickRegistry;

@SuppressWarnings("serial")
public class GPanel2D extends JPanel implements ITick {

	public ArrayList<Entity2D> mobs;
	
	/**
	 * Creates a new GPanel2D, and automatically registers it for 50ms ticks and installs all EventListeners in the EventRegistry
	 */
	public GPanel2D() {
		
		this.mobs = new ArrayList<Entity2D>();
		
		ListenerRegistry.registerGPanel2D(this);
		TickRegistry.registerTick(this, this.toString(), 50);
		
	}
	
	@Override
	public void tick() {
		
		for ( Entity2D mob : (Entity2D[]) mobs.toArray() ) {
			
			mob.update();
			
		}
		
	}
	
	public void tz_addGenericListener(EventListener l) {
		
		if (l instanceof KeyListener) this.addKeyListener((KeyListener) l);
		if (l instanceof MouseListener) this.addMouseListener((MouseListener) l);
		if (l instanceof MouseMotionListener) this.addMouseMotionListener((MouseMotionListener) l);
		
	}
	
}
