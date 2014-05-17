package com.treyzania.api.games.games3d.render.shapes;

import java.awt.Graphics;

import com.treyzania.api.games.Vector3F;
import com.treyzania.api.games.games3d.render.textures.MappedQuad;
import com.treyzania.api.games.games3d.render.textures.QuadPixel;

public class ROTexturedQuad extends RenderingObject {

	public MappedQuad quad;
	
	public ROTexturedQuad(MappedQuad mq) {
		this.quad = mq;
	}
	
	@Override
	public float getDistanceFromViewpoint(Vector3F viewpoint) {
		return 0; // FIXME Change this.
	}

	@Override
	public void render(Graphics g) {
		
		int w = quad.texture.texture.getWidth();
		int h = quad.texture.texture.getHeight();
		
		for (int x = 0; x < w; x++) {
			
			for (int y = 0; y < h; y++) {
				
				QuadPixel pixel = quad.texPixels[x][y];
				
				int[] xVals = new int[4];
				int[] yVals = new int[4];
				
				xVals[0] = (int) pixel.cornerUpperLeft.x;
				yVals[0] = (int) pixel.cornerUpperLeft.y;
				
				xVals[1] = (int) pixel.cornerUpperRight.x;
				yVals[1] = (int) pixel.cornerUpperRight.y;
				
				xVals[2] = (int) pixel.cornerLowerLeft.x;
				yVals[2] = (int) pixel.cornerLowerLeft.y;
				
				xVals[3] = (int) pixel.cornerLowerRight.x;
				yVals[3] = (int) pixel.cornerLowerRight.y;
				
				g.setColor(pixel.color);
				g.fillPolygon(xVals, yVals, 4);
				
			}
			
		}
		
	}

}
