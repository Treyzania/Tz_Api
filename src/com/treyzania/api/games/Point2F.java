package com.treyzania.api.games;

public class Point2F {

	public final float x;
	public final float y;
	
	public Point2F(float x, float y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public Point2F multiply(Point2F by) {
		return new Point2F(this.x * by.x, this.y * by.y);
	}
	
}
