package com.treyzania.api.games.games3d.render.plotting;

import com.treyzania.api.games.Vector3PRY;

public interface IFull3D {

	public void setFOV(double fovAngle);
	public double getFOV();
	
	public void setViewVector(Vector3PRY vec3);
	public Vector3PRY getViewVector();
	
}
