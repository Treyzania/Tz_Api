package com.treyzania.api.games.gfx2d;

import java.awt.Graphics2D;

import com.treyzania.api.games.Entity2D;

public abstract class Model {

	public final Entity2D boundEntity;
	public Bounds bounds;
	
	public Model(Entity2D entity) {
		
		this.boundEntity = entity;
		this.bounds = new Bounds();
		
	}
	
	public abstract void render(Graphics2D g2d);
	
}
