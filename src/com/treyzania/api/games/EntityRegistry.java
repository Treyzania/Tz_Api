package com.treyzania.api.games;

import java.util.ArrayList;

import com.treyzania.api.games.games2d.Entity2D;
import com.treyzania.api.games.games3d.Entity3D;

public class EntityRegistry {

	public static ArrayList<Entity2D> entities2d;
	public static ArrayList<Entity3D> entities3d; 
	
	/**
	 * Adds an entity to the list.  Automatically done if entity is created through automatic processes.
	 * 
	 * @param entity the entity being registered.
	 * @return success.
	 */
	public static boolean registerEntity(Entity entity) {
		
		if (entity instanceof Entity2D) {
			
			entities2d.add((Entity2D) entity);
			return true;
			
		} else if (entity instanceof Entity3D) {
			
			entities3d.add((Entity3D) entity);
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
}
