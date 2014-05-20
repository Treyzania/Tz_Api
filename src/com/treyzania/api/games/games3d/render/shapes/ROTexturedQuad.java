package com.treyzania.api.games.games3d.render.shapes;

import java.awt.Graphics;
import java.awt.Polygon;

import com.treyzania.api.games.Point2F;
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
		
		System.out.println("Number of pixels this shape: " + (w * h));
		
		for (int x = 0; x < w; x++) {
			
			for (int y = 0; y < h; y++) {
				
				QuadPixel pixel = quad.texPixels[x][y];
				
				System.out.println("Rending quadpixel: " + x + "/" + w + ", " + y + "/" + h);
				
				Polygon gon = new Polygon();
				
				Point2F ul = pixel.cornerUpperLeft;
				Point2F ur = pixel.cornerUpperRight;
				Point2F ll = pixel.cornerLowerLeft;
				Point2F lr = pixel.cornerLowerRight;
				
				gon.addPoint((int) ul.x, (int) ul.y);
				gon.addPoint((int) ll.x, (int) ll.y);
				gon.addPoint((int) lr.x, (int) lr.y);
				gon.addPoint((int) ur.x, (int) ur.y);
				
				System.out.println("UL: " + ul);
				System.out.println("UR: " + ur);
				System.out.println("LL: " + ll);
				System.out.println("LR: " + lr);
				
				g.setColor(pixel.color);
				g.fillPolygon(gon);
				
				System.out.println();
				
			}
			
		}
		
	}

}
