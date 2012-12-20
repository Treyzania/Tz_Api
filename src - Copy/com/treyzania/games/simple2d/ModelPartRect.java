package com.treyzania.games.simple2d;

import java.awt.Graphics2D;

public class ModelPartRect extends ModelPart {
	
	public int sx, sy, w, h;
	
	public ModelPartRect(int sx, int sy, int w, int h) {

		this.sx = sx;
		this.sy = sy;
		this.w = w;
		this.h = h;
		
	}

	public void render(Graphics2D g2d, int x, int y) { g2d.drawRect(x + sx, y + sy, w, h); }

}
