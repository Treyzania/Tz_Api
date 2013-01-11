package com.treyzania.api.games.games3d;


public class PlotterIsometric_45deg extends Plotter {

	public float distaceScale;
	public EnumIsometricViewpoint viewpoint;
	
	public PlotterIsometric_45deg(EnumIsometricViewpoint viewpoint, float scale) {
		
		this.viewpoint = viewpoint;
		this.distaceScale = scale;
		
	}
	
	public PlotterIsometric_45deg(float scale) {
		
		this(EnumIsometricViewpoint.SOUTHWEST, scale);
		
	}
	
	@Override
	public int[] plot(Entity3D e3d, int Xoff, int Yoff) {
		
		int[] points = new int[2];
		
		int ex = (int) e3d.x;
		int ey = (int) e3d.y;
		int ez = (int) e3d.z;
		int rx = 0;
		int ry = 0;
		
		/*
		 * Old testing code.
		 * 
		rx += ex * scale;
		ry += ex * scale;
		
		rx -= ey * scale;
		ry -= ey * scale;
		
		ry -= ez;
		*/
		
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
