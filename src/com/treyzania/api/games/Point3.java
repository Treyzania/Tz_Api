package com.treyzania.api.games;

import com.treyzania.api.games.games2d.Point;

/**
 * A 3-D point class, extends the "Point" class from "com.treyzania.api.games.games2d".
 * 
 * @author Treyzania
 *
 */
public class Point3 extends Point {

	public double z;
	
	public Point3(double x, double y, double z) {
		
		super(x, y);
		
		this.z = z;
		
	}
	
	// TODO Add fancier methods.
	
}
