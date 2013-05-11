package com.treyzania.api.games.games3d.render;

import com.treyzania.api.games.games2d.Point;
import com.treyzania.api.games.games3d.Point3;
import com.treyzania.api.games.games3d.Vector3;

/**
 * A very special plotter that uses this algorithm: "http://en.wikipedia.org/wiki/3D_projection#Perspective_projection"
 * 
 * @author Treyzania
 *
 */
public class PlotterProjectionPerspective_A extends Plotter implements IFull3D {

	public Vector3 viewpoint;
	public double fov;
	
	public PlotterProjectionPerspective_A(Vector3 vec3, double fov) {
		
		this.viewpoint = vec3;
		this.fov = fov;
		
	}
	
	@Override
	public Point plot(Point3 point3d) {
		
		// TODO Rewrite the algorithm in "http://en.wikipedia.org/wiki/3D_projection#Perspective_projection".
		
		return point3d; // All this will do is some very bad stuff.
		
	}

	@Override
	public void setFOV(double fovAngle) {
		this.fov = fovAngle;
	}

	@Override
	public double getFOV() {
		return this.fov;
	}

	@Override
	public void setViewVector(Vector3 vec3) {
		this.viewpoint = vec3;
	}

	@Override
	public Vector3 getViewVector() {
		return this.viewpoint;
	}

}
