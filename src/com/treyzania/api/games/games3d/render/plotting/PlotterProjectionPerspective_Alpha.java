package com.treyzania.api.games.games3d.render.plotting;

import com.treyzania.api.games.Point3;
import com.treyzania.api.games.Vector3PRY;
import com.treyzania.api.games.games2d.Point;

/**
 * A very special plotter that uses this algorithm: "http://en.wikipedia.org/wiki/3D_projection#Perspective_projection"
 * 
 * @author Treyzania
 *
 */
public class PlotterProjectionPerspective_Alpha extends Plotter implements IFull3D {

	public Vector3PRY viewpoint;
	public double fov;
	
	public PlotterProjectionPerspective_Alpha(Vector3PRY vec3, double fov) {
		
		this.viewpoint = vec3;
		this.fov = fov;
		
	}
	
	@Override
	public Point plot(Point3 point3d) {
		
		/*
		 * Here is a TON of values,
		 * don't ask to use arrays for each grouping.
		 *  
		 *  TODO Make an explanation of the different values
		 *  
		 *  TODO Finish defining the "theta" values and the "e" values.
		 *  
		 */
		
		// Initialize the initial (resource) values.
		Point3 l = this.viewpoint.myPool.location;
		
		// Initialize the initial (plotting) values.
		double aX = point3d.x;
		double aY = point3d.y;
		double aZ = point3d.z;
		double cX = l.x;
		double cY = l.y;
		double cZ = l.z;
		double thetaX = this.viewpoint.pitch;
		double thetaY = this.viewpoint.roll;
		double thetaZ = this.viewpoint.yaw;
		double eX = 0;
		double eY = 0;
		double eZ = 0;
		
		// Define the point cache.
		double dX;
		double dY;
		double dZ;
		
		// Define the final points.
		double bX;
		double bY;
		
		// First step in calculations.
		dX = Math.cos(thetaY) * ( Math.sin(thetaZ) * ( aY - cY ) + Math.cos(thetaZ) * ( aX - cX ) ) - Math.sin(thetaY) * ( aZ - cZ );
		dY = Math.sin(thetaX) * ( Math.cos(thetaY) * ( aZ - cZ ) + Math.sin(thetaY) * ( Math.sin(thetaZ) * ( aY - cY ) + Math.cos(thetaZ) * ( aX - cX ) ) ) + Math.cos(thetaX) * ( Math.cos(thetaZ) * ( aY - cY ) - Math.sin(thetaZ) * ( aX - cX ) );
		dZ = Math.cos(thetaX) * ( Math.cos(thetaY) * ( aZ - cZ ) + Math.sin(thetaY) * ( Math.sin(thetaZ) * ( aY - cY ) + Math.cos(thetaZ) * ( aX - cX ) ) ) + Math.sin(thetaX) * ( Math.cos(thetaZ) * ( aY - cY ) - Math.sin(thetaZ) * ( aX - cX ) );
		
		// Second step in calculations.
		bX = ( ( eZ / dZ ) * dX ) - eX;
		bY = ( ( eZ / dZ ) * dY ) - eY;
		
		// Return the values
		return new Point(bX, bY);
		
		/* Whew... */
		
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
	public void setViewVector(Vector3PRY vec3) {
		this.viewpoint = vec3;
	}

	@Override
	public Vector3PRY getViewVector() {
		return this.viewpoint;
	}

}
