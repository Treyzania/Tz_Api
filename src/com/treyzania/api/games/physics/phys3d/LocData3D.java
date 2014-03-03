package com.treyzania.api.games.physics.phys3d;

public class LocData3D {

	public Velocity3DStack velStack;
	
	public double x = 0;
	public double y = 0;
	public double z = 0;
	
	public LocData3D() {
		
		this.velStack = new Velocity3DStack();
		
	}
	
	public LocData3D(double x, double y, double z) {
		
		this();
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
}
