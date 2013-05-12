package com.treyzania.api.games.ai3d;

import com.treyzania.api.games.games3d.Entity3D;

public abstract class AIModule {

	Entity3D myEntity;
	
	public AIModule(Entity3D entity) {
		
		this.myEntity = entity;
		
	}
	
	/**
	 * Called once per world tick.
	 * 
	 * @return if anything happened
	 */
	public abstract boolean tick();
	
}
