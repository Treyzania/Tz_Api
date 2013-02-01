package com.treyzania.api.games;

import java.util.ArrayList;

import com.treyzania.api.games.games3d.Entity3D;

public class World3D extends World {

	public ArrayList<Entity3D> entities = new ArrayList<Entity3D>();
	
	public World3D() {
		
	}
	
	public void addEntityAt(Entity3D entity, double x, double y, double z) {
		
		entity.location.x = x;
		entity.location.y = y;
		entity.location.z = z;
		
		entities.add(entity);
		
	}
	
	public void tickAll() {
		
		for (Entity3D entity : entities) {
			
			entity.update();
			
		}
		
	}
	
}
