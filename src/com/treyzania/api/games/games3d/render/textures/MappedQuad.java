package com.treyzania.api.games.games3d.render.textures;

import java.awt.Color;

import com.treyzania.api.games.Point2F;
import com.treyzania.api.games.games3d.render.RenderingTexture;

public class MappedQuad {

	public RenderingTexture texture;
	public Point2F[] points;
	
	public static class Pixel {
		
		public Point2F cornerUpperLeft;
		public Point2F cornerUpperRight;
		public Point2F cornerLowerLeft;
		public Point2F cornerLowerRight;
		
		public Color color;
		
	}
	
}
