package com.treyzania.api.games.games3d.render.shapes;

import java.awt.Color;
import java.awt.Graphics;

import com.treyzania.api.games.Vector3F;
import com.treyzania.api.games.games3d.render.textures.Quad;

public class ROSolidQuad extends RenderingObject {

	public Quad quad;
	public Color color;
	
	public ROSolidQuad(Quad quad, Color color) {
		
		this.quad = quad;
		this.color = color;
		
	}
	
	@Override
	public float getDistanceFromViewpoint(Vector3F viewpoint) {
		return 0; // FIXME Change this.
	}

	@Override
	public void render(Graphics g) {
		
		int[] xVals = new int[4];
		int[] yVals = new int[4];
		
		xVals[0] = (int) quad.cornerUpperLeft.x;
		yVals[0] = (int) quad.cornerUpperLeft.y;
		
		xVals[1] = (int) quad.cornerUpperRight.x;
		yVals[1] = (int) quad.cornerUpperRight.y;
		
		xVals[2] = (int) quad.cornerLowerLeft.x;
		yVals[2] = (int) quad.cornerLowerLeft.y;
		
		xVals[3] = (int) quad.cornerLowerRight.x;
		yVals[3] = (int) quad.cornerLowerRight.y;
		
		g.fillPolygon(xVals, yVals, 4);
		
	}

}
