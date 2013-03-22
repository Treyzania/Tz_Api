package com.treyzania.api.games.games3d;

import java.util.ArrayList;

public class Vector3Pool {

	public ArrayList<Vector3> vectors;
	public double x, y, z; // Coordinates of this pool.
	
	public Vector3Pool(double x, double y, double z) {
		
		this.vectors = new ArrayList<Vector3>();
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public Vector3 gimmieANewVector() {
		
		Vector3 vec = new Vector3();
		vec.myPool = this;
		vectors.add(vec);
		
		return vec;
		
	}
	
}
