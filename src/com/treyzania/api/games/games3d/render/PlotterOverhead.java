package com.treyzania.api.games.games3d.render;

import com.treyzania.api.games.games2d.Point;
import com.treyzania.api.games.games3d.Point3;

public class PlotterOverhead extends Plotter {

	public EnumOverheadViewpoint viewpoint;
	public float force;
	
	public int xOff;
	public int yOff;
	
	public PlotterOverhead(EnumOverheadViewpoint viewpoint) {
		
		this.viewpoint = viewpoint;
		this.force = 0.05F;
		
	}
	
	public void setForceFactor(float factor) {
		
		this.force = factor;
		
	}
	
	public PlotterOverhead setOffX(int off) {
		this.xOff = off;
		return this;
	}
	
	public PlotterOverhead settOffY(int off) {
		this.yOff = off;
		return this;
	}
	
	@Override
	public Point plot(Point3 p3) {
		
		double px = p3.x;
		double py = p3.y;
		double pz = p3.z;
		
		double rx = 0;
		double ry = 0;
		
		if (viewpoint == EnumOverheadViewpoint.EAST) {
			
			rx = py * -1;
			ry = px * -1;
			
		} else if (viewpoint == EnumOverheadViewpoint.NORTH) {
			
			rx = px;
			ry = py * -1;
			
		} else if (viewpoint == EnumOverheadViewpoint.WEST) {
			
			rx = py;
			ry = px;
			
		} else if (viewpoint == EnumOverheadViewpoint.SOUTH) {
			
			rx = px * -1;
			ry = py;
			
		}
		
		ry -= pz * 0.05F; // TODO Check for properness.
		
		rx += this.xOff;
		ry += this.yOff;
		
		Point output = new Point(rx, ry);
		
		return output;
		
	}

}
