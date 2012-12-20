package com.treyzania.games;

public abstract class Entity {

	public int health, maxHealth;
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
	
	public void ai() { }
	public abstract void updatePos();
	
}
