package com.treyzania.api.games.games2d;

import com.treyzania.api.games.Entity;
import com.treyzania.api.games.ICustomPhysics;
import com.treyzania.api.games.games2d.old.Model;
import com.treyzania.api.util.ResourceRegistry;

public class Entity2D extends Entity {
	
	public double x, y;
	
	public Model model;
	
	public Entity2D(String name, Model model) {
		
		super(name);
		
		this.model = model; 
		
	}
	
	@Override
	public void update() {
		
		super.update();
		
		if (this instanceof ICustomPhysics) {
			((ICustomPhysics) this).updatePhysics();
		} else if (this instanceof IPhysicsAccess2D) {
			ResourceRegistry.getCurrentEnvironment().updateVelocity((IPhysicsAccess2D) this);
		} else {
			// Nothing
		}
		
	}
	
	public int rx() { return (int) x; }
	public int ry() { return (int) y; }
	

}
