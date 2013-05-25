package com.treyzania.api.games.content.world.types.voxel3d;

import com.treyzania.api.games.content.tile.TileInstance;

public class TileInstance3D extends TileInstance {

	public final VoxelWorld3D world;
	public final int x, y, z;
	
	public TileInstance3D(VoxelWorld3D w, int x, int y, int z) {
		
		this.world = w;
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}

	public Tile3D findTile() {
		return world.getTile(x, y, z);
	}
	
	public TE3D findTileEntity() {
		return world.getTileEntity(x, y, z);
	}
	
}
