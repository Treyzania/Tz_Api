package com.treyzania.api.games.games3d;

public class Vector3 {

	public Vector3Pool myPool;
	public double pitch;
	public double roll;
	public double yaw;
	
	protected Vector3(double p, double r, double y) {
		
		this.pitch = p;
		this.roll = r;
		this.yaw =  y;
		
	}
	
	protected Vector3(double p, double r) {
		
		this.pitch = p;
		this.roll = r;
		this.yaw = 0D;
		
	}
	
	public Point3 getPointAtLength(double length) {
		
		Point3 point = null;
		
		// TODO Add code for figuring out the return.
		
		return point;
		
	}
	
}
