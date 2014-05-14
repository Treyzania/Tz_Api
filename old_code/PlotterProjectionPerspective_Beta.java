package com.treyzania.api.games.games3d.render.plotting;

import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import com.treyzania.api.games.games3d.Point3D;
import com.treyzania.api.games.games3d.Vector3PRY;

/**
 * A different but similar plotter to the "A" version of this.
 * 
 * @author Treyzania
 * 
 */
public class PlotterProjectionPerspective_Beta extends Plotter {

	public Vector3PRY viewpoint;
	public double fov;

	public PlotterProjectionPerspective_Beta(Vector3PRY vec3, double fov) {

		this.viewpoint = vec3;
		this.fov = fov;

	}

	@SuppressWarnings("unused")
	@Override
	public Double plot(Point3D point3d) {
		
		// TODO Update this method to use values from file "notes/Beta algorithm design1.pdn".  This is hurting my brain.
		
		// Define (and set some of) the different values.
		double p_x = point3d.x;
		double p_y = point3d.y;
		double p_z = point3d.z;
		double a_x = p_x; // Are these 3 proper?
		double a_y = p_y;
		double a_z = p_z;
		double x_l;
		double y_l;
		
		Vector3PRY vpToP = Vector3.change_XYZtoPRY(this.viewpoint.myPool.createNewVector_XYZ(point3d));
		double yawDiff = vpToP.yaw - this.viewpoint.yaw;
		double pitchDiff = vpToP.pitch - this.viewpoint.pitch;
		
		
		// Step 0?: Rotate the whole point structure.
		
		// Step 1: Find Relative distances.
		// TODO Step 1
		
		
		
		// X
		x_l = Point2D.distance(a_x, a_y, 0, 0);
		
		
		
		// Y
		
		// Step 2: Compute angles.
		// TODO Step 2
		
		
		// Step 3: Do fancy multiplication.
		// TODO Step 3
		
		// NOW RETURN IT!
		return new Double(0, 0); // All this will do is some very bad stuff.
		
	}

}
