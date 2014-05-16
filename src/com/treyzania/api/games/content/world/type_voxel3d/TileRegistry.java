package com.treyzania.api.games.content.world.type_voxel3d;

public class TileRegistry {

	public static Tile3D[] tiles = new Tile3D[2 ^ 16];
	
	public void registerTile(Tile3D t) {
		
		int id = t.id;
		
		if (tiles[id] != null) {
			
			throw new IllegalArgumentException(
					
					// WHY IS THERE SOOOOOO MANY TABS!!!
					
								"Tile3D conflict: Tile #"
								+ id
								+ " is already occupied by "
								+ tiles[id].toString()
								+ " when adding "
								+ t.toString()
								+ "."
			
			);
			
		} else {
			
			tiles[id] = t;
			
		}
		
	}
	
	public static Tile3D getTile(int id) {
		return tiles[id];
	}
	
}
