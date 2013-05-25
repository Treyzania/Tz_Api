package com.treyzania.api.games;

public abstract class Vector3 {

	public final Vector3Pool myPool;
	
	protected Vector3(Vector3Pool pool) {
		
		this.myPool = pool;
		
	}
	
	public abstract Point3 getPointAtLength(double length);
	
	// Begin "static" methods...
	
	/**
	 * Creates a new vector that is identical to the input, however it uses the XYZ version of Vector3, not RPY.
	 * 
	 * NOTE: This won't pay any attention to "roll" (yet).
	 * 
	 * @param pry
	 * @return
	 */
	public static Vector3XYZ change_PRYtoXYZ(Vector3PRY pry) {
		
		double destX = (Math.cos(pry.pitch) * -1) * Math.sin(pry.yaw);
		double destY = Math.sin(pry.pitch) * -1;
		double destZ = Math.cos(pry.pitch) * Math.cos(pry.yaw);
		// TODO Y U NO USE ROLL?!?!?!  Y U ONLY USE PITCH AND YAW!?!??!?!?
		
		return new Vector3XYZ(pry.myPool, new Point3(destX, destY, destZ));
		
	}
	
	/**
	 * Creates a new vector that is identical to the input, however it uses the RPY version of Vector3, not XYZ.
	 * 
	 * NOTE: Doesn't actually work properly.
	 * 
	 * @param xyz
	 * @return
	 */
	public static Vector3PRY change_XYZtoPRY(Vector3XYZ xyz) {
		
		// TODO Add code to reverse this.
		double pitch = 0;
		double roll = 0;
		
		return new Vector3PRY(xyz.myPool, pitch, roll);
		
	}
	
}
