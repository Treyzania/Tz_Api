package com.treyzania.api.games.games2d;

import java.util.ArrayList;

import com.treyzania.api.games.content.entity.Entity;
import com.treyzania.api.games.physics.IEntityListener;
import com.treyzania.api.games.physics.phys2d.IEntityListener2D;
import com.treyzania.api.games.physics.phys2d.Location2D;
import com.treyzania.api.games.physics.phys2d.Velocity2DStack;

public class Entity2D extends Entity {

	public Velocity2DStack velStack;
	public Model model;
	public ArrayList<IEntityListener2D> listeners;
	
	public Location2D location;
	
	public Entity2D(String name, Model model) {
		
		super(name);
		
		this.model = model;
		
	}

	@Override
	public boolean registerListener(IEntityListener iel) {
		
		return listeners.add((IEntityListener2D) iel);
		
	}
	
	public double getX() { return location.x; }
	public double getY() { return location.y; }
	
}
