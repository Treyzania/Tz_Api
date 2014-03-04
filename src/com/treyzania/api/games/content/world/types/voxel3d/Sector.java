package com.treyzania.api.games.content.world.types.voxel3d;

import java.awt.Point;

public class Sector {

	public final VoxelWorld3D myWorld;
	public final Point mySpot;
	
	public int[][][] tiles;
	public TE3D[][][] tes;
	
	protected Sector(VoxelWorld3D world, Point spot) {
		
		this.myWorld = world;
		this.mySpot = spot;
		
		this.tiles = new int[VoxelWorld3D.sectorSize][world.worldHeight][VoxelWorld3D.sectorSize];
		this.tes = new TE3D[VoxelWorld3D.sectorSize][world.worldHeight][VoxelWorld3D.sectorSize];
		
	}
	
}
