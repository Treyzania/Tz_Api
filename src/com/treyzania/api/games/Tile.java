package com.treyzania.api.games;

import java.awt.Color;

/**
 * Uses the same rules at the blocks and items in Minecraft.  (One object, used for all events.)
 * 
 * 
 * @author Trey
 *
 */
public class Tile {

	public final int id;
	public final Color tileColor;
	
	
	
	public Tile(int id, Color color) {
		
		this.id = id;
		this.tileColor = color;
		
	}
	
	public Color getColor() {
		
		return this.tileColor;
		
	}
	
}
