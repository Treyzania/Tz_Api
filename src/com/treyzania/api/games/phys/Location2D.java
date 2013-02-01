package com.treyzania.api.games.phys;

public class Location2D {

	public Velocity2DStack velStack;
	
	public double x = 0;
	public double y = 0;
	
	public Location2D() {
		
		this.velStack = new Velocity2DStack();
		
	}
	
	public Location2D(double x, double y) {
		
		this();
		
		this.x = x;
		this.y = y;
		
	}
	
	public void calcChanges() {
		
		
		
	}
	
}
