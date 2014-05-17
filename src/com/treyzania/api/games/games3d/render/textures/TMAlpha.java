package com.treyzania.api.games.games3d.render.textures;

import java.awt.Color;

import com.treyzania.api.games.games3d.render.RenderingTexture;

public class TMAlpha extends TextureMapper {

	@Override
	public QuadPixel[][] mapTexture(MappedQuad quad, RenderingTexture tex) {
		
		int w = tex.texture.getWidth();
		int h = tex.texture.getHeight();
		
		QuadPixel[][] qpaa = new QuadPixel[w][h];
		
		for (int x = 0; x < w; x++) {
			
			for (int y = 0; y < h; y++) {
				
				QuadPixel qPx = new QuadPixel();
				
				qPx.cornerUpperLeft = quad.points[x][y];
				qPx.cornerUpperRight = quad.points[x + 1][y];
				qPx.cornerLowerLeft = quad.points[x][y + 1];
				qPx.cornerLowerRight = quad.points[x + 1][y + 1];
				
				qPx.color = new Color(tex.texture.getRGB(x, y));
				
				qpaa[x][y] = qPx;
				
			}
			
		}
		
		return qpaa;
		
	}

}
