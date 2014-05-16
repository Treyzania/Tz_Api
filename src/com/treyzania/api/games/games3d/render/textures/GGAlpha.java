package com.treyzania.api.games.games3d.render.textures;

import com.treyzania.api.games.games3d.render.RenderingTexture;

public class GGAlpha extends GridGenerator {

	@SuppressWarnings("unused")
	@Override
	public MappedQuad map(Quad quad, RenderingTexture tex) {
		
		/*
		 * 
		 * Take the reciprocal of the dimentions into two increments,
		 * then make a grid of points 1 unit in size greater than the dimentions of the texture. 
		 * 
		 */
		
		int xPixels = tex.texture.getWidth();
		int yPixels = tex.texture.getHeight();
		
		float xIncr = 1F / xPixels;
		float yIncr = 1F / yPixels;
		
		for (int x = 0; x < (xPixels + 1); x++) {
			
			for (int y = 0; y < (yPixels + 1); y++) {
				
				float xFactor = x * xIncr;
				float yFactor = y * yIncr;
				
				// /r/theydidntdothemath (yet)
				
			}
			
		}
		
		return null;
		
	}

}
