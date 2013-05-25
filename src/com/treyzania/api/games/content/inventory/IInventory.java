package com.treyzania.api.games.content.inventory;

import com.treyzania.api.games.content.item.Stack;

public interface IInventory {

	public int getInventoryLength();
	
	public Stack getItemStack(int loc);
	public void setStack(int loc, Stack stack);
	
	public Stack[] getWholeInventory();
	
}
