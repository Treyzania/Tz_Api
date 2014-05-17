package com.treyzania.api.games;

public class PointHelper {

	public static Point3F averageLocation(Point3F... points) {
		
		float ax = 0;
		float ay = 0;
		float az = 0;
		
		for (int i = 0; i < points.length; i++) {
			
			ax += points[i].x;
			ay += points[i].y;
			az += points[i].z;
			
		}
		
		int cnt = points.length;
		
		return new Point3F(ax / cnt, ay / cnt, az / cnt);
		
	}
	
	public static Point2F averageLocation(Point2F... points) {
		
		float ax = 0;
		float ay = 0;
		
		for (int i = 0; i < points.length; i++) {
			
			ax += points[i].x;
			ay += points[i].y;
			
		}
		
		int cnt = points.length;
		
		return new Point2F(ax / cnt, ay / cnt);
		
	}
	
}
