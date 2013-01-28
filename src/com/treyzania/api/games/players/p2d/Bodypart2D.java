package com.treyzania.api.games.players.p2d;

import java.awt.Graphics2D;

import com.treyzania.api.games.Entity;
import com.treyzania.api.games.players.Bodypart;

public abstract class Bodypart2D extends Bodypart {

	public Bodypart2D(double x, double y) {
		
		super(x, y);
		
	}
	
	// TODO Switch ep to type EntityPlayer.
	public abstract void render(Graphics2D g2d, Entity ep);

}
