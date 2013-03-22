package com.treyzania.api.games.content.item;

import javax.swing.ImageIcon;

public class Stack {

	public int id;
	
	protected Stack(int id) {
		
		this.id = id;
		
	}
	
	protected Stack(Item item) {
		this(item.itemId);
	}
	
	public ImageIcon getIcon() {
		
		return ItemRegistry.getItem(this.id).icon;
		
	}
	
}
