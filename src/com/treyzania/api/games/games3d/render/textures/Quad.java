package com.treyzania.api.games.games3d.render.textures;

import com.treyzania.api.games.Point2F;

public class Quad {

	public Point2F cornerUpperLeft;
	public Point2F cornerUpperRight;
	public Point2F cornerLowerLeft;
	public Point2F cornerLowerRight;
	
	/**
	 * Creates a new quadrangle, without any proper pixel mapping.<br/>
	 * It is ready to map.
	 * 
	 * @param corner0 Upper left corner.
	 * @param corner1 Upper right corner.
	 * @param corner2 Lower left corner.
	 * @param corner3 Lower right corner.
	 */
	public Quad(Point2F corner0, Point2F corner1, Point2F corner2, Point2F corner3) {
		
		this.cornerUpperLeft = corner0;
		this.cornerUpperRight = corner1;
		
		this.cornerLowerLeft = corner2;
		this.cornerLowerRight = corner3;
		
	}
	
}
