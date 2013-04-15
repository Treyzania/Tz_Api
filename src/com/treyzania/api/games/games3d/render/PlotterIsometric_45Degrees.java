package com.treyzania.api.games.games3d.render;

import com.treyzania.api.games.games2d.Point;
import com.treyzania.api.games.games3d.Point3;

public class PlotterIsometric_45Degrees extends Plotter {

	public float distaceScale;
	public EnumIsometricViewpoint viewpoint;
	
	public int xOff;
	public int yOff;
	
	public PlotterIsometric_45Degrees(EnumIsometricViewpoint viewpoint, float scale) {
		
		this.viewpoint = viewpoint;
		this.distaceScale = scale;
		
	}
	
	public PlotterIsometric_45Degrees(float scale) {
		
		this(EnumIsometricViewpoint.SOUTHWEST, scale);
		
	}
	
	public PlotterIsometric_45Degrees setOffX(int off) {
		this.xOff = off;
		return this;
	}
	
	public PlotterIsometric_45Degrees settOffY(int off) {
		this.yOff = off;
		return this;
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
			
			rx -= py * distaceScale;
			ry -= py * distaceScale;
			
			ry -= pz;
			
		} else if (viewpoint == EnumIsometricViewpoint.SOUTHWEST) {
			
			rx -= px * distaceScale;
			ry += px * distaceScale;
			
			rx += py * distaceScale;
			ry -= py * distaceScale;
			
			ry -= pz;
			
		} else if (viewpoint == EnumIsometricViewpoint.NORTHWEST) {
			
			rx -= px * distaceScale;
			ry -= px * distaceScale;
			
			rx += py * distaceScale;
			ry += py * distaceScale;
			
			ry -= pz;
			
		} else if (viewpoint == EnumIsometricViewpoint.NORTHEAST) {
			
			rx += px * distaceScale;
			ry -= px * distaceScale;
			
			rx -= py * distaceScale;
			ry += py * distaceScale;
			
			ry -= pz;
			
		}
		
		rx += this.xOff;
		ry += this.yOff;
		
		Point point = new Point(rx, ry);
		
		return point;
		
	}

}
