package com.treyzania.api.games;

import javax.swing.ImageIcon;

public class Item {

	public static Item[] items = new Item[65536];
	public static Item errorHandlerItem = new Item(0, new ImageIcon());
	
	public final int itemId;
	public final ImageIcon icon;
	
	public Item(int id, ImageIcon icon) {
		
		this.itemId = id;
		this.icon = icon;
		
	}
	
	public ImageIcon getIcon(Stack is) {
		return this.icon;
	}
	
	public Stack createNewStack() {
		return new Stack(this);
	}
	
	
	
	
}
