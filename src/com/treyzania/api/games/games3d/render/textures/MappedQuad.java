package com.treyzania.api.games.games3d.render.textures;

import com.treyzania.api.games.Point2F;
import com.treyzania.api.games.games3d.render.RenderingTexture;

public class MappedQuad extends Quad {

	public MappedQuad(Quad quad, GridGenerator gg) {
		
		super(quad.cornerUpperLeft, quad.cornerUpperRight, quad.cornerLowerLeft, quad.cornerLowerRight);
		
		gg.map(this, null);
		
	}

	public RenderingTexture texture;
	public Point2F[] points;
	
}
