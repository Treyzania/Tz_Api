package com.treyzania.api.games.physics.phys2d;

import java.util.ArrayList;

public class Velocity2DStack {

	public ArrayList<Velocity2DRay> rays;
	
	public Velocity2DStack() {
		
		this.rays = new ArrayList<Velocity2DRay>();
		
	}
	
	@SuppressWarnings("unused")
	public void ticks() {
		
		for (Velocity2DRay theRay : rays) {
			
			
			
		}
		
	}
	
}
