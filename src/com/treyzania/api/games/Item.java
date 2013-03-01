package com.treyzania.api.games;

import javax.swing.ImageIcon;

public class Item {

	public final int itemId;
	public int maxStack;
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
