package com.treyzania.api.games.physics.phys3d;

import com.treyzania.api.games.games3d.Entity3D;

public class EntityEvent3D {

	private final Entity3D entity;
	
	protected EntityEvent3D(Entity3D entity) {
		
		this.entity = entity;
		
	}
	
	public Velocity3DStack getVelocityStack() {
		
		return entity.location.velStack;
		
	}

	public Entity3D getEntity() {
		return entity;
	}
	
}
