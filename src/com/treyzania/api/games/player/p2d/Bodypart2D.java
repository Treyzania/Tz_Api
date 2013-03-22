package com.treyzania.api.games.player.p2d;

import java.awt.Graphics2D;

import com.treyzania.api.games.content.entity.Entity;

public abstract class Bodypart2D {

	public Bodypart2D(double x, double y) {
		
	}
	
	// TODO Switch ep to type EntityPlayer.
	public abstract void render(Graphics2D g2d, Entity ep);

}
