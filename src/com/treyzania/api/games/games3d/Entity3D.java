package com.treyzania.api.games.games3d;

import java.util.ArrayList;

import com.treyzania.api.games.content.entity.Entity;
import com.treyzania.api.games.physics.IEntityListener;
import com.treyzania.api.games.physics.phys3d.EntityListener3D;
import com.treyzania.api.games.physics.phys3d.LocData3D;

public class Entity3D extends Entity {
	
	public ArrayList<EntityListener3D> listeners;
	
	public LocData3D location;
	
	public Entity3D(String name) {
		
		super(name);
		
	}

	@Override
	public boolean registerListener(IEntityListener iel) {
		return listeners.add((EntityListener3D) iel);
	}
	
	public double getX() { return location.x; }
	public double getY() { return location.y; }
	public double getZ() { return location.z; }
	
}
