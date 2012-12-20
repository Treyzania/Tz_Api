package com.treyzania.games.simple2d;

import java.awt.Graphics2D;

public class ModelPartLine extends ModelPart {
	
	int sx, sy, ex, ey;
	
	public ModelPartLine(int sx, int sy, int ex, int ey) {
		
		this.sx = sx;
		this.sy = sy;
		this.ex = ex;
		this.ey = ey;
		
	}
	
	public void render(Graphics2D g2d, int x, int y) { g2d.drawLine(x + sx, y + sy, x + ex, y + ey); }
	
}