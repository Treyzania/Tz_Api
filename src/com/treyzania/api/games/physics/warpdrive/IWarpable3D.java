package com.treyzania.api.games.physics.warpdrive;

import com.treyzania.api.games.physics.IWarpable;

public interface IWarpable3D extends IWarpable {

	public double getShrinkX();
	public double getShrinkY();
	public double getShrinkZ();
	
	public double getExpandX();
	public double getExpandY();
	public double getExpandZ();
	
}
