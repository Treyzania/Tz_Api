package com.treyzania.api.games.games2d.old;

import java.awt.Graphics2D;
import java.util.Vector;

import com.treyzania.api.games.games2d.Entity2D;

public abstract class Model {
	
	public Vector<ModelPart> parts = new Vector<ModelPart>();
	
	public Model() { }
	
	public void render(Graphics2D g2d, int x, int y, Entity2D mob) {
		
		for (int i = 0; i < parts.size(); i++) {
			
			parts.get(i).render(g2d, x, y);
			
		}
		
		if (this instanceof IModelFX) {
			IModelFX fxmodel = (IModelFX) this;
			fxmodel.modelFX(g2d, x, y, mob);
		}
		
	}
	
	public void addLine(int sx, int sy, int ex, int ey) { parts.add(new ModelPartLine(sx, sy, ex, ey)); }
	public void addRect(int sx, int sy, int w, int h) { parts.add(new ModelPartRect(sx, sy, w, h)); }
	public void addOval(int sx, int sy, int w, int h) { parts.add(new ModelPartOval(sx, sy, w, h)); }
	
}
