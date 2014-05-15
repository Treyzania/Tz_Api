package com.treyzania.api.games.games3d.render;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class RenderingTexture {

	public final BufferedImage texture;
	
	public RenderingTexture(BufferedImage img) {
		
		this.texture = img;
		
	}
	
	public Color getPixelColor(int x, int y) {
		return new Color(texture.getRGB(x, y));
	}
	
}
