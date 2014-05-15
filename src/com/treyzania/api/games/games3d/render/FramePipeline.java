package com.treyzania.api.games.games3d.render;

import java.util.HashMap;

import com.treyzania.api.games.Point2F;
import com.treyzania.api.games.Point3F;
import com.treyzania.api.games.games3d.render.plotting.Plotter;

public class FramePipeline {

	public final Plotter plottingEngine;
	public final IViewpointProvider ivp;
	
	public HashMap<Point3F, Point2F> pointMappings;
	public HashMap<String, RenderingTexture> textures;
	
	public FramePipeline(Plotter plotter, IViewpointProvider ivp) {
		
		this.plottingEngine = plotter;
		this.ivp = ivp;
		
	}
	
}
