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
public class PlotterWikipedian extends Plotter {

	public Vector3 viewpoint;
	public double fov;
	
	public PlotterWikipedian(Vector3 vec3, double fov) {
		
		this.viewpoint = vec3;
		this.fov = fov;
		
	}
	
	@Override
	public Point plot(Point3 point3d) {
		
		// TODO Rewrite the algorithm in "http://en.wikipedia.org/wiki/3D_projection#Perspective_projection".
		
		return point3d; // All this will do is some very bad stuff.
		
	}

}
