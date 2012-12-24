package com.treyzania.api.util;

import java.util.ArrayList;
import java.util.EventListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

import com.treyzania.api.games.Entity2D;

@SuppressWarnings("serial")
public class GPanel extends JPanel implements ITick {

	public ArrayList<Entity2D> mobs;
	
	public GPanel() {
		
		this.mobs = new ArrayList<Entity2D>();
		
		EventRegistry.panels.add(this);
		ResourceRegistry.tickReg().addTick(new Tick(this.toString(), this, 50));
		
	}

	@Override
	public void tick() {
		
		for ( Entity2D mob : (Entity2D[]) mobs.toArray() ) {
			
			mob.update();
			
		}
		
	}
	
	public void tz_addListener(EventListener l) {
		
		if (l instanceof KeyListener) this.addKeyListener((KeyListener) l);
		if (l instanceof MouseListener) this.addMouseListener((MouseListener) l);
		if (l instanceof MouseMotionListener) this.addMouseMotionListener((MouseMotionListener) l);
		
		
	}
	
}
