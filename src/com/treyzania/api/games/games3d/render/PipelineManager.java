package com.treyzania.api.games.games3d.render;

import com.treyzania.api.games.games3d.render.plotting.Plotter;
import com.treyzania.api.games.games3d.render.textures.GridGenerator;
import com.treyzania.api.games.games3d.render.textures.TextureMapper;

public class PipelineManager {

	public Plotter plottingEngine;
	public GridGenerator interpolationEngine;
	public TextureMapper textureBindingEngine;
	
	public FramePipeline createNewPipeline() {
		
		return null;
		
	}
	
}
