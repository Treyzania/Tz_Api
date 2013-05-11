package com.treyzania.api.games.games3d.render;

import com.treyzania.api.games.games2d.Point;
import com.treyzania.api.games.games3d.Point3;

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
	public Point plot(Point3 p3) {
		
		double px = p3.x;
		double py = p3.y;
		double pz = p3.z;
		
		double rx = 0;
		double ry = 0;
		
		if (viewpoint == EnumOverheadViewpoint.EAST) {
			
			rx = pz * -1;
			ry = px * -1;
			
		} else if (viewpoint == EnumOverheadViewpoint.NORTH) {
			
			rx = px;
			ry = pz * -1;
			
		} else if (viewpoint == EnumOverheadViewpoint.WEST) {
			
			rx = pz;
			ry = px;
			
		} else if (viewpoint == EnumOverheadViewpoint.SOUTH) {
			
			rx = px * -1;
			ry = pz;
			
		}
		
		ry -= py * 0.05F; // TODO Check for properness.
		
		Point output = new Point(rx, ry);
		
		return output;
		
	}

}
