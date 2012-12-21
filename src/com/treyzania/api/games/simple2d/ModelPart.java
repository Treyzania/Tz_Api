package com.treyzania.api.games.simple2d;

import java.awt.Graphics2D;

public abstract class ModelPart {
	
	public ModelPart() { }
	
	public abstract void render(Graphics2D g2d, int x, int y);
	
}
