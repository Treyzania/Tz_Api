package com.treyzania.api.games.games3d.render.plotting;

import static java.lang.Math.*;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import com.treyzania.api.games.games3d.Point3D;
import com.treyzania.api.games.games3d.Vector3PRY;

/**
 * A very special plotter that uses this algorithm: "http://en.wikipedia.org/wiki/3D_projection#Perspective_projection"
 * 
 * @author Treyzania
 *
 */
public class PlotterProjectionPerspective_Alpha extends Plotter {

	public Vector3PRY viewpoint;
	public double fov;
	
	public PlotterProjectionPerspective_Alpha(Vector3PRY vec3, double fov) {
		
		this.viewpoint = vec3;
		this.fov = fov;
		
	}
	
	@Override
	public Double plot(Point3D point3d) {
		
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
		Point3D l = this.viewpoint.myPool.location;
		
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
		dX = cos(thetaY) * ( sin(thetaZ) * ( aY - cY ) + cos(thetaZ) * ( aX - cX ) ) - sin(thetaY) * ( aZ - cZ );
		dY = sin(thetaX) * ( cos(thetaY) * ( aZ - cZ ) + sin(thetaY) * ( sin(thetaZ) * ( aY - cY ) + cos(thetaZ) * ( aX - cX ) ) ) + cos(thetaX) * ( cos(thetaZ) * ( aY - cY ) - sin(thetaZ) * ( aX - cX ) );
		dZ = cos(thetaX) * ( cos(thetaY) * ( aZ - cZ ) + sin(thetaY) * ( sin(thetaZ) * ( aY - cY ) + cos(thetaZ) * ( aX - cX ) ) ) + sin(thetaX) * ( cos(thetaZ) * ( aY - cY ) - sin(thetaZ) * ( aX - cX ) );
		
		// Second step in calculations.
		bX = ( ( eZ / dZ ) * dX ) - eX;
		bY = ( ( eZ / dZ ) * dY ) - eY;
		
		// Return the values
		return new Point2D.Double(bX, bY);
		
		/* Whew... */
		
	}

}
