package com.treyzania.api.games;

import javax.swing.ImageIcon;

public class ItemRegistry {

	public static Item[] items = new Item[65536];
	public static Item errorHandlerItem = new Item(0, new ImageIcon());
	
	public void init() {
		
		registerItem(errorHandlerItem);
		
	}
	
	public static boolean registerItem(Item item) {
		
		if (items[item.itemId] != null) {
			
			items[item.itemId] = item;
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public static Item getItem(int id) {
		
		if (id < 0 || id >= 65536) {
			
			return null;
			
		} else {
			
			return items[id];
			
		}
		
	}
	
	public static boolean checkId(int id) {
		
		return (getItem(id) == null);
		
	}
	
}
