package com.treyzania.api.games;

public class Point3F {

	public final float x;
	public final float y;
	public final float z;
	
	public Point3F(float x, float y, float z) {
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	public Point3F(Point3F from) {
		this(from.x, from.y, from.z);
	}

	@Override
	public boolean equals(Object it) {
		
		boolean out = false;
		
		if (it instanceof Point3F) {
			
			out = true;
			
			Point3F that = (Point3F) it;
			
			// The actual checking.  Is this how you actually use this setter?
			out &= this.x == that.x;
			out &= this.y == that.y;
			out &= this.z == that.z;
			
		}
		
		return out;
		
	}
	
}
