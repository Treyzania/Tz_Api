package com.treyzania.api.games.games3d;

public class PlotterOverhead extends Plotter {

	public EnumOverheadViewpoint viewpoint;
	public float force;
	
	public PlotterOverhead(EnumOverheadViewpoint viewpoint) {
		
		this.viewpoint = viewpoint;
		this.force = 0.05F;
		
	}
	
	public void setForceFactor(float factor) {
		
		this.force = factor;
		
	}
	
	@Override
	public int[] plot(Entity3D e3d, int Xoff, int Yoff) {
		
		int[] output = new int[2];
		
		double ex = e3d.location.x;
		double ey = e3d.location.y;
		double ez = e3d.location.z;
		
		double rx = 0;
		double ry = 0;
		
		if (viewpoint == EnumOverheadViewpoint.EAST) {
			
			rx = ey * -1;
			ry = ex * -1;
			
		} else if (viewpoint == EnumOverheadViewpoint.NORTH) {
			
			rx = ex;
			ry = ey * -1;
			
		} else if (viewpoint == EnumOverheadViewpoint.WEST) {
			
			rx = ey;
			ry = ex;
			
		} else if (viewpoint == EnumOverheadViewpoint.SOUTH) {
			
			rx = ex * -1;
			ry = ey;
			
		}
		
		ry -= ez * 0.05F; // TODO Check for easyness.
		
		output[0] = (int) rx;
		output[1] = (int) ry;
		
		return output;
		
	}

}
