package com.treyzania.api.games.phys_old;

public class Vec3D {

	// TODO Add code for interpolation/extrapolation of points & lines.
	float x, y, z;
	
	public Vec3D(float x, float y, float z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public Vec3D(Vec3D vec3d) {
		
		this.x = vec3d.x;
		this.y = vec3d.y;
		this.z = vec3d.z;
		
	}
	
}
