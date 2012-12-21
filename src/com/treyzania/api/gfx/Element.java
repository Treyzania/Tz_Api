package com.treyzania.api.gfx;

import java.awt.Graphics2D;

import com.treyzania.api.games.simple2d.Model;

public abstract class Element extends Model {

	public abstract void render(Graphics2D g2d, int x, int y);
	
}