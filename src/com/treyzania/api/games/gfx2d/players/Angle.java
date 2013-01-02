package com.treyzania.api.games.gfx2d.players;

public class Angle {
	
	public float first;
	public float second;
	
	public Angle(float first, float second) {
		
		this.first = first;
		this.second = second;
		
	}
	
	public void offset(float factor) {
		
		first += factor;
		second += factor;
		
	}
	
	public void resize(float amount) {
		
		second += amount;
		
	}
	
	
	
}
