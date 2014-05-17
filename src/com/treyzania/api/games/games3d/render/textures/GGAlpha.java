package com.treyzania.api.games.games3d.render.textures;

import java.awt.Point;
import java.util.HashMap;

import com.treyzania.api.games.Point2F;
import com.treyzania.api.games.games3d.render.RenderingTexture;

public class GGAlpha extends GridGenerator {

	@SuppressWarnings("unused")
	@Override
	public Point2F[][] map(Quad quad, RenderingTexture tex) {
		
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
		
		Point2F[][] mappedPoints = new Point2F[xPixels + 1][yPixels + 1];
		HashMap<Point, Point2F> points = new HashMap<Point, Point2F>();
		
		// Create the top row.
		for (int i = 0; i <= xPixels; i++) {
			mappedPoints[i][0] = interpolate(quad.cornerUpperLeft, quad.cornerUpperRight, i * xIncr);
		}
		
		// Create the bottom row.
		for (int i = 0; i <= xPixels; i++) {
			mappedPoints[i][xPixels] = interpolate(quad.cornerLowerLeft, quad.cornerLowerRight, i * xIncr);
		}
		
		// Create the left side.
		for (int i = 1; i < yPixels; i++) {
			mappedPoints[0][i] = interpolate(quad.cornerUpperLeft, quad.cornerLowerLeft, i * yIncr);
		}
		
		// Create the right side.
		for (int i = 1; i < yPixels; i++) {
			mappedPoints[yPixels][i] = interpolate(quad.cornerUpperRight, quad.cornerLowerRight, i * yIncr);
		}
		
		// Fill in the middle.
		for (int x = 1; x < xPixels; x++) {
			
			for (int y = 1; y < yPixels; y++) {
				
				float magFactor = x * xIncr;
				
				Point2F leftAnchor = mappedPoints[0][y];
				Point2F rightAnchor = mappedPoints[xPixels][y];
				
				mappedPoints[x][y] = interpolate(leftAnchor, rightAnchor, magFactor);
				
			}
			
		}
		
		return mappedPoints;
		
	}
	
	private static Point2F interpolate(Point2F p1, Point2F p2, float magnitude) {
		return new Point2F((p1.x + p2.x) * magnitude, (p1.y + p2.y) * magnitude);
	}
	
}
