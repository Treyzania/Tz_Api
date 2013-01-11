package com.treyzania.api.gui;

import java.awt.Graphics2D;

import com.treyzania.api.games.games2d.old.Model;

public abstract class Element extends Model {

	public int x;
	public int y;
	
	public Element(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public abstract void render(Graphics2D g2d);
	
}