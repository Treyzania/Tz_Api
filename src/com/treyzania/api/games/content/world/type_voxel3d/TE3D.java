package com.treyzania.api.games.content.world.type_voxel3d;

import com.treyzania.api.games.content.tile.TileEntity;

public class TE3D extends TileEntity {

	public final VoxelWorld3D myWorld;
	
	public TE3D(VoxelWorld3D w) {
		
		this.myWorld = w;
		
	}
	
	public void tick(TileInstance3D te) {
		
	}
	
	public void randomTick(TileInstance3D te) {
		
	}
	
}
