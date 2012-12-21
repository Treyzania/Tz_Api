package com.treyzania.api.games;

import com.treyzania.api.games.simple2d.Model;

public abstract class Entity2DGrav extends Entity2D {
	
	public double xVel, yVel;
	
	public Entity2DGrav(Model model) {
		
		super(model);
		
	}
	
	
	
}
