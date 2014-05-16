package com.treyzania.api.games.content.world.type_voxel3d;

import java.awt.Point;
import java.util.HashMap;

import com.treyzania.api.games.content.world.World3D;
import com.treyzania.api.games.games3d.Entity3D;

public class VoxelWorld3D extends World3D {

	public static final int sectorSize = 64;
	
	public int worldHeight;
	
	public HashMap<Point, Sector> sectors;
	
	public VoxelWorld3D(int height) {
		
		this.worldHeight = height;
		
	}
	
	public TileInstance3D createTileInstance(int x, int y, int z) {
		return new TileInstance3D(this, x, y, z);
	}
	
	/**
	 * Updates all of the Tile3D-s and all of the Entity3Ds.
	 * 
	 */
	public void tickAll() {
		
		// Loop through the sectors.
		Sector[] loopedSectors = (Sector[]) sectors.values().toArray();
		for (int i = 0; i < loopedSectors.length; i++) {
			
			// Loop through the sector's 'X' values. (EW)
			for (int x = 0; x < sectorSize; x++) {
				
				// Loop through the sector's 'Y' values. (UD)
				for (int y = 0; y < this.worldHeight; y++) {
					
					// Loop through the sector's 'Z' values. (NS)
					for (int z = 0; z < sectorSize; z++) {
						
						// TODO Add code for ticking (Updating?) the Tiles, TEs, etc.
						
					}
					
				}
				
			}
			
		}
		
		// Loop through the ArrayList of entities.
		for (int i = 0; i < entities.size(); i++) {
			
			Entity3D e = entities.get(i);
			
			e.update(); // Is this the proper method to call?
			
		}
		
	}
	
	/**
	 * Gets the sector object.  Directly uses a PointI object.
	 * 
	 * @param point
	 * @return
	 */
	public Sector getSector(Point point) {
		return sectors.get(point);
	}
	
	/**
	 * Calls "getSector(PointI)" but this allows the use of two integers.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public Sector getSector(int x, int y) {
		return this.getSector(new Point(x, y));
	}
	
	public Tile3D getTile(int x, int y, int z) {
		
		Tile3D t = null;
		
		// Initial Setups
		int sectorX = (int) Math.floor(x / sectorSize);
		int sectorY = (int) Math.floor(z / sectorSize);
		int sectorXpoint = x % sectorSize;
		int sectorZpoint = z % sectorSize;
		
		// Secondary Setups
		Sector sector = this.getSector(sectorX, sectorY);
		
		// Find the ID, then lookup the tile.  Then return.
		t = TileRegistry.getTile(sector.tiles[sectorXpoint][y][sectorZpoint]);
		return t;
		
	}
	
	public TE3D getTileEntity(int x, int y, int z) {
		
		TE3D te = null;
		
		// Initial Setups
		int sectorX = (int) Math.floor(x / sectorSize);
		int sectorY = (int) Math.floor(z / sectorSize);
		int sectorXpoint = x % sectorSize;
		int sectorZpoint = z % sectorSize;
		
		// Secondary Setups
		Sector sector = this.getSector(sectorX, sectorY);
		
		// Find the TE.  Then return.
		te = sector.tes[sectorXpoint][y][sectorZpoint];
		return te;
		
	}
	
	public void setTile(int id, int x, int y, int z) {
		
		// Initial Setups
		int sectorX = (int) Math.floor(x / sectorSize);
		int sectorY = (int) Math.floor(z / sectorSize);
		int sectorXpoint = x % sectorSize;
		int sectorZpoint = z % sectorSize;
		
		// Secondary Setups
		Sector sector = this.getSector(sectorX, sectorY);
		
		sector.tiles[sectorXpoint][y][sectorZpoint] = id;
		
	}
	
	public void setTile(Tile3D tile, int x, int y, int z) {
		this.setTile(tile.id, x, y, z);
	}
	
}
