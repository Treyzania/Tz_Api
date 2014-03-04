package com.treyzania.api.games.games3d;

/**
 * A simple reimplementaton of a double-bassed 3D point class.
 * 
 * @author Trey
 *
 */
public class Point3D {

	public double x;
	public double y;
	public double z;
	
	public Point3D(double x, double y, double z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public Point3D() {
		this(0D, 0D, 0D);
	}
	
	public Point3D(Point3D other) {
		this(other.x, other.y, other.z);
	}
	
}
