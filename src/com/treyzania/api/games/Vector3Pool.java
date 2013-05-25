package com.treyzania.api.games;

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
	
	public Vector3PRY createNewVector_PRY(double pitch, double roll, double yaw) {
		
		Vector3PRY vec = new Vector3PRY(this, pitch, roll, yaw);
		vectors.add(vec);
		
		return vec;
		
	}
	
	public Vector3PRY createNewVector_PRY(double pitch, double roll) {
		return this.createNewVector_PRY(pitch, roll, 0);
	}
	
	public Vector3XYZ createNewVector_XYZ(Point3 point) {
		
		Vector3XYZ vec = new Vector3XYZ(this, point);
		vectors.add(vec);
		
		return vec;
		
	}
	
	public Vector3XYZ createNewVector_XYZ(double x, double y, double z) {
		return this.createNewVector_XYZ(new Point3(x, y, z));
	}
	
}
