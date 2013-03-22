package com.treyzania.api.games.content.entity;

import com.treyzania.api.games.physics.IEntityListener;

public abstract class Entity {
	
	public final long birthTime;
	
	// Constructor
	public Entity(String name) {
		
		this.birthTime = System.currentTimeMillis();
		
	}
	
	/**
	 * Updates this entity.  Do not override without knowing what you are doing.
	 */
	public void update() {
		
		this.ai();
		
	}
	
	/**
	 * For any AI calls.
	 */
	public void ai() { }
	
	/**
	 * Registers a listener.  Useful for makeshift warp drives. *Wink*.
	 * 
	 * @param iel the listener.
	 * @return success.
	 */
	public abstract boolean registerListener(IEntityListener iel);
	
}
