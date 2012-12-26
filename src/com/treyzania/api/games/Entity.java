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
		
	}
	
	/**
	 * For any AI calls.
	 */
	public void ai() { }
	
}
