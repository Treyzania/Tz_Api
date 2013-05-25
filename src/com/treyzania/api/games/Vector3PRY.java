package com.treyzania.api.games;

public class Vector3PRY extends Vector3 {

	public double pitch;
	public double roll;
	public double yaw;
	
	protected Vector3PRY(Vector3Pool pool, double p, double r, double y) {
		
		super(pool);
		
		this.pitch = p;
		this.roll = r;
		this.yaw =  y;
		
	}
	
	protected Vector3PRY(Vector3Pool pool, double p, double r) {
		this(pool, p, r, 0);
	}
	
	@Override
	public Point3 getPointAtLength(double length) {
		
		Point3 point = null;
		
		// TODO Add code for figuring out the return.
		
		return point;
		
	}
	
}
