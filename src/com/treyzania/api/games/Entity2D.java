package com.treyzania.api.games;

import com.treyzania.api.games.simple2d.Model;

public class Entity2D extends Entity {
	
	public double x, y;
	
	public Model model;
	
	public Entity2D(Model model) {
		
		this.model = model; 
		
		
	}
	
	@Override
	public void update() {
		
		super.update();
		
		this.updatePos();
		
	}
	
	
	public void updatePos() {
		
		// TODO Add physics
		
	}
	
	public int rx() { return (int) x; }
	public int ry() { return (int) y; }
	

}
