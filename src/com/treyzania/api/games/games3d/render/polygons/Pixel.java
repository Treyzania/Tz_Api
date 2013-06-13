package com.treyzania.api.games.games3d.render.polygons;

import java.awt.Color;

import com.treyzania.api.games.games2d.Point;

public class Pixel {

	public final Color color;
	
	public final Point upperLeft;
	public final Point upperRight;
	public final Point lowerLeft;
	public final Point lowerRight;
	
	/**
	 * Creates a new pixel.
	 * 
	 * @param pixelColor the color of the pixel.
	 * @param corner1 the upper left corner coordinates.
	 * @param corner2 the upper right corner coordinates.
	 * @param corner3 the lower left corner coordinates.
	 * @param corner4 the lower right corner coordinates.
	 */
	public Pixel(Color pixelColor, Point corner1, Point corner2, Point corner3, Point corner4) {
		
		this.color = pixelColor;
		
		this.upperLeft = corner1;
		this.upperRight = corner2;
		this.lowerLeft = corner3;
		this.lowerRight = corner4;
		
	}
	
}
