package com.treyzania.api.games.simple2d;

import java.awt.Graphics2D;

public class ModelPartOval extends ModelPart {


	public int sx, sy, w, h;
	
	public ModelPartOval(int sx, int sy, int w, int h) {

		this.sx = sx;
		this.sy = sy;
		this.w = w;
		this.h = h;
		
	}

	public void render(Graphics2D g2d, int x, int y) { g2d.drawOval(x + sx, y + sy, w, h); }

}
