package com.treyzania.api.games.phys;

import com.treyzania.api.games.games2d.Entity2D;

public class EntityEvent2D {

	private final Entity2D entity;
	
	protected EntityEvent2D(Entity2D entity) {
		
		this.entity = entity;
		
	}
	
	public Velocity2DStack getVelocityStack() {
		
		return entity.location.velStack;
		
	}

	public Entity2D getEntity() {
		return entity;
	}
	
}
