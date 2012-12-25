package com.treyzania.api.games;

public abstract class Entity {
	
	public String name = "";
	
	// Constructors
	public Entity() {}
	
	public Entity(String name) {
		
		this.name = name;
		
	}
	
	public void update() {
		
		this.ai();
		this.updatePos();
		
	}
	
	/**
	 * For any AI calls.
	 */
	public void ai() { }
	
	/**
	 * For updating the physics.
	 * EX: [environment_object].updateEntity2D(this);
	 */
	public abstract void updatePos();
	
}
