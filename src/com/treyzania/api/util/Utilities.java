package com.treyzania.api.util;

import com.treyzania.api.games.games2d.Point;

/**
 * Some generic utilities are provided by this class. The code in this class is
 * only here because they are only single methods and don't actually need their
 * own classes IMO.
 * 
 * @author Trey
 * 
 */
public class Utilities {

	// TODO Add utilities.

	public static void X_0_XxX_pLaCeHoLdEr_XxX_00_X() {
		System.out.println("No.");
	}

	public static double distanceBetween(Point a, Point b) {

		return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));

	}

	public static double distanceBetween(double ax, double ay, double bx,
			double by) {

		return distanceBetween(new Point(ax, ay), new Point(bx, by));

	}

}
