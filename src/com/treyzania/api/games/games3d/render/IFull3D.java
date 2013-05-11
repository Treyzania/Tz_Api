package com.treyzania.api.games.games3d.render;

import com.treyzania.api.games.games3d.Vector3;

public interface IFull3D {

	public void setFOV(double fovAngle);
	public double getFOV();
	
	public void setViewVector(Vector3 vec3);
	public Vector3 getViewVector();
	
}
