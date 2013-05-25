package com.treyzania.api.games.games3d.render.plotting;

import com.treyzania.api.games.Point3;
import com.treyzania.api.games.games2d.Point;

public class PlotterIsometric_45Degrees extends Plotter {

	public float distaceScale;
	public EnumIsometricViewpoint viewpoint;
	
	public PlotterIsometric_45Degrees(EnumIsometricViewpoint viewpoint, float scale) {
		
		this.viewpoint = viewpoint;
		this.distaceScale = scale;
		
	}
	
	public PlotterIsometric_45Degrees(float scale) {
		
		this(EnumIsometricViewpoint.SOUTHWEST, scale);
		
	}
	
	@Override
	public Point plot(Point3 p3) {
		
		int px = (int) p3.x;
		int py = (int) p3.y;
		int pz = (int) p3.z;
		int rx = 0;
		int ry = 0;
		
		if (viewpoint == EnumIsometricViewpoint.SOUTHEAST) {
			
			rx += px * distaceScale;
			ry += px * distaceScale;
			
			rx -= pz * distaceScale;
			ry -= pz * distaceScale;
			
			ry -= py;
			
		} else if (viewpoint == EnumIsometricViewpoint.SOUTHWEST) {
			
			rx -= px * distaceScale;
			ry += px * distaceScale;
			
			rx += pz * distaceScale;
			ry -= pz * distaceScale;
			
			ry -= py;
			
		} else if (viewpoint == EnumIsometricViewpoint.NORTHWEST) {
			
			rx -= px * distaceScale;
			ry -= px * distaceScale;
			
			rx += pz * distaceScale;
			ry += pz * distaceScale;
			
			ry -= py;
			
		} else if (viewpoint == EnumIsometricViewpoint.NORTHEAST) {
			
			rx += px * distaceScale;
			ry -= px * distaceScale;
			
			rx -= pz * distaceScale;
			ry += pz * distaceScale;
			
			ry -= py;
			
		}
		
		Point point = new Point(rx, ry);
		
		return point;
		
	}

}
