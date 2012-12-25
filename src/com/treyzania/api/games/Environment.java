package com.treyzania.api.games;

public class Environment {

	public float vertical_windResistance;
	public float horizontal_windResistance;
	
	public float gravityFactor;
	
	public Environment() {
		
		this.vertical_windResistance = 0F;
		this.horizontal_windResistance = 0F;
		
		this.gravityFactor = 0.0F;
		
	}
	
	public void updateVelocity(Entity2D e2d) {
		
		// TODO Add velocity stuffs.
		
	}
	
}
