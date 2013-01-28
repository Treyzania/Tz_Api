package com.treyzania.api.games;

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
	
}
