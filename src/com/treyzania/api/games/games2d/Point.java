package com.treyzania.api.games.games2d;

/**
 * This is a point class added for completeness and specialization.  Inculdes a static method for "java.awt.Point" adaption.
 * 
 * @author Treyzania
 *
 */
public class Point {

	public double x;
	public double y;
	
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	/**
	 * Creates a Point object using a "java.awt.Point" object.
	 * 
	 * @param awt A java.awt.Point object.
	 * @return An adaption of the AWT version.
	 */
	public static Point createFromAWT(java.awt.Point awt) {
		
		return new Point(awt.x, awt.y);
		
	}
	
}
