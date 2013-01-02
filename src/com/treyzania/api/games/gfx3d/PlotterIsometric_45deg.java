package com.treyzania.api.games.gfx3d;

import com.treyzania.api.games.Entity3D;

public class PlotterIsometric_45deg extends Plotter {

	public float scale;
	
	public PlotterIsometric_45deg(float scale) {
		
		this.scale = scale;
		
	}
	
	@SuppressWarnings("unused")
	@Override
	public int[] plot(Entity3D e3d, int Xoff, int Yoff) { // Currently assumes viewpoint as "EnumIsometricViewpoint.SOUTHWEST"
		
		int[] points = new int[2];
		
		int ex = (int) e3d.x;
		int ey = (int) e3d.y;
		int ez = (int) e3d.z;
		int rx = 0;
		int ry = 0;
		
		rx += ex * scale;
		ry += ex * scale;
		
		rx += ey * scale;
		ry -= ey * scale;
		
		ry -= ex;
		
		return points;
		
	}

}
