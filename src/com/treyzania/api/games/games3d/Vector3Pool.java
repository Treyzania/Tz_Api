package com.treyzania.api.games.games3d;

import java.util.ArrayList;

public class Vector3Pool {

	public ArrayList<Vector3> vectors;
	public Point3 location;
	
	public Vector3Pool(double x, double y, double z) {
		this(new Point3(x, y, z));
	}
	
	public Vector3Pool(Point3 p) {
		
		this.vectors = new ArrayList<Vector3>();
		this.location = p;
		
	}
	
	public Vector3 createNewVector(double pitch, double roll, double yaw) {
		
		Vector3 vec = new Vector3(pitch, roll, yaw);
		vec.myPool = this;
		vectors.add(vec);
		
		return vec;
		
	}
	
	public Vector3 createNewVector(double pitch, double roll) {
		
		return this.createNewVector(pitch, roll, 0);
		
	}
	
}
