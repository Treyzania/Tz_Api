package com.treyzania.api.games.phys;

public class Warp3D extends Warp {

	public IWarpable3D iw3d;
	
	public Warp3D(double warpFactor, IWarpable3D iw3d) {
		
		super(warpFactor);
		
		this.iw3d = iw3d;
		
	}

}
