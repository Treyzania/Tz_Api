package com.treyzania.api.games.games3d.render.textures;

import com.treyzania.api.games.Point2F;
import com.treyzania.api.games.games3d.render.RenderingTexture;

public class MappedQuad extends Quad {
	
	public RenderingTexture texture;
	public Point2F[][] points;
	public QuadPixel[][] texPixels;
	
	public MappedQuad(Quad quad, RenderingTexture tex) {
		
		super(quad.cornerUpperLeft, quad.cornerUpperRight, quad.cornerLowerLeft, quad.cornerLowerRight);
		
		this.texture = tex;
		
		this.points = new Point2F[1][1];
		this.texPixels = new QuadPixel[1][1];
		
	}
	
	public void gridify(GridGenerator gg) {
		this.points = gg.map(this, texture);
	}
	
	public void texMapping(TextureMapper tm) {
		this.texPixels = tm.mapTexture(this, texture);
	}
	
}
