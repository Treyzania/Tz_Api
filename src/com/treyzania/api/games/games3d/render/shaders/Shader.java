package com.treyzania.api.games.games3d.render.shaders;

import com.treyzania.api.games.games3d.render.modelrender.Rendition;

public abstract class Shader {

	public Shader() {
		
	}
	
	public final Rendition calculate(Rendition rend) {
		
		// Is all of this code proper?
		
		Rendition r = this.shade(rend);
		r.shaded = true;
		
		return r;
		
	}
	
	protected abstract Rendition shade(Rendition rend);
	
}
