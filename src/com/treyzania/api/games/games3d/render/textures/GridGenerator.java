package com.treyzania.api.games.games3d.render.textures;

import com.treyzania.api.games.games3d.render.RenderingTexture;

public abstract class GridGenerator {

	public abstract MappedQuad map(Quad quad, RenderingTexture tex);
	
}
