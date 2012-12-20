package com.treyzania.api.io;

public class EntryCompound extends Entry implements ISubfiles {
	
	public Entry[] entries;
	
	public EntryCompound(String name) {
		
		super(name);
		
		this.entries = new Entry[256];
		
	}
	
	public Entry getEntry(int i) {
		
		return entries[i];
		
	}
	
}
