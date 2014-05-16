package com.treyzania.api.games.games3d.render;

import com.treyzania.api.games.Vector3F;

public class StaticVP implements IViewpointProvider {

	public final Vector3F viewpoint;
	
	public StaticVP(Vector3F vp) {
		this.viewpoint = vp;
	}
	
	@Override
	public Vector3F getViewpoint() {
		return this.viewpoint;
	}

}
