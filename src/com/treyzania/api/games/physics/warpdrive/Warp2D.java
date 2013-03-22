package com.treyzania.api.games.physics.warpdrive;


public class Warp2D extends Warp {

	public IWarpable2D iw2d;
	
	public Warp2D(double warpFactor, IWarpable2D iw2d) {
		
		super(warpFactor);
		
		this.iw2d = iw2d;
		
	}

}
