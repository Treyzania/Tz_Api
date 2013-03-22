package com.treyzania.api.games.physics.warpdrive;


public class Warp3D extends Warp {

	public IWarpable3D iw3d;
	
	public Warp3D(double warpFactor, IWarpable3D iw3d) {
		
		super(warpFactor);
		
		this.iw3d = iw3d;
		
	}

}
