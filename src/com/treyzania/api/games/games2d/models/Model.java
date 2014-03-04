package com.treyzania.api.games.games2d.models;

import java.awt.Graphics2D;
import java.awt.Point;
import java.util.HashMap;

import com.treyzania.api.games.games2d.Bounds;
import com.treyzania.api.games.games2d.Entity2D;

public abstract class Model {

	public final Entity2D boundEntity;
	public Bounds bounds;
	
	public HashMap<String, Point> specialPoints;
	
	public Model(Entity2D entity) {
		
		this.boundEntity = entity;
		this.bounds = new Bounds();
		
	}
	
	public abstract void render(Graphics2D g2d);
	
}
