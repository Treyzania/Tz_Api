package com.treyzania.api.games.games3d.render;

import java.awt.Graphics;

import com.treyzania.api.games.Vector3F;

public interface IRenderable {

	public float getDistanceFromViewpoint(Vector3F viewpoint);
	public void render(Graphics g);
	
}
