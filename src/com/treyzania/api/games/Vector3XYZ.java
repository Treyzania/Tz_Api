package com.treyzania.api.games;

public class Vector3XYZ extends Vector3 {

	public Point3 pointingTo;
	
	protected Vector3XYZ(Vector3Pool pool, Point3 pointingTo) {
		
		super(pool);
		
		this.pointingTo = pointingTo;
		
	}
	
	@Override
	public Point3 getPointAtLength(double length) {
		// TODO Auto-generated method stub
		return null;
	}

}
