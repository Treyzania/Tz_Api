package com.treyzania.api.games.games3d.render;

import com.treyzania.api.games.games3d.Entity3D;


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
	public int[] plot(Entity3D e3d, int Xoff, int Yoff) {
		
		int[] points = new int[2];
		
		int ex = (int) e3d.location.x;
		int ey = (int) e3d.location.y;
		int ez = (int) e3d.location.z;
		int rx = 0;
		int ry = 0;
		
		if (viewpoint == EnumIsometricViewpoint.SOUTHEAST) {
			
			rx += ex * distaceScale;
			ry += ex * distaceScale;
			
			rx -= ey * distaceScale;
			ry -= ey * distaceScale;
			
			ry -= ez;
			
		} else if (viewpoint == EnumIsometricViewpoint.SOUTHWEST) {
			
			rx -= ex * distaceScale;
			ry += ex * distaceScale;
			
			rx += ey * distaceScale;
			ry -= ey * distaceScale;
			
			ry -= ez;
			
		} else if (viewpoint == EnumIsometricViewpoint.NORTHWEST) {
			
			rx -= ex * distaceScale;
			ry -= ex * distaceScale;
			
			rx += ey * distaceScale;
			ry += ey * distaceScale;
			
			ry -= ez;
			
		} else if (viewpoint == EnumIsometricViewpoint.NORTHEAST) {
			
			rx += ex * distaceScale;
			ry -= ex * distaceScale;
			
			rx -= ey * distaceScale;
			ry += ey * distaceScale;
			
			ry -= ez;
			
		}
		
		rx += Xoff;
		ry += Yoff;
		
		points[0] = rx;
		points[1] = ry;
		
		return points;
		
	}

}
