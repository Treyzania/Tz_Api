package com.treyzania.api.games.games3d.render.textures;

import com.treyzania.api.games.Point2F;
import com.treyzania.api.games.games3d.render.RenderingTexture;

public abstract class GridGenerator {

	public abstract Point2F[][] map(Quad quad, RenderingTexture tex);
	
}
