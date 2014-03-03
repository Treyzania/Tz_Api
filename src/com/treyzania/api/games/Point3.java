package com.treyzania.api.games;

import com.treyzania.api.games.games2d.Point;

/**
 * A 3-D point class, extends the "Point" class from
 * "com.treyzania.api.games.games2d".
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

	public double distTo(Point3 p) {

		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)
				+ Math.pow(this.z - p.z, 2));

	}

}
