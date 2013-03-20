package com.treyzania.api.io;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

public abstract class Entry extends Object implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6371930141958209816L;
	public EntryCompound parent;
	
	public Entry() {
		this(null);
	}
	
	public Entry(EntryCompound parent) {
		this.parent = parent;
	}
	
	/**
	 * Gets this entry's parent compound.
	 * 
	 * @return
	 */
	public EntryCompound getParent() {
		return parent;
	}
	
	/**
	 * Gets this entry's first ancestor.
	 * 
	 * @return
	 */
	public EntryCompound getFirstAncestor() {
		
		EntryCompound ec = this.parent;
		EntryCompound lastEc = null;
		boolean done = false;
		
		while (!done) {
			
			try {
				
				lastEc = ec;
				ec = ec.getParent();
				if (ec instanceof RootDirectory || ec.getParent() == null) done = true;
				
				if (lastEc != null && lastEc == ec) { // Check to see if someone is a asshole.
					System.err.println("wtf? your're an asshole!"); // Looks like they are an asshole...
					break;
				}
				
			} catch (NullPointerException npe) {
				done = true;
			}
			
		}
		
		return ec;
		
	}
	
	/**
	 * Returns the name of this entry.
	 * NOTE: This is a very round-a-bout & trial-and-error method.
	 * 
	 * @return
	 */
	public String getFilename() {
		
		String name = "";
		
		try {
			
			HashMap<String, Entry> theMap = this.parent.entries;
			Iterator<String> entryIterator = theMap.keySet().iterator();
			
			for (int i = 0; i < theMap.size(); i++) {
				
				String entryName = entryIterator.next();
				
				if (theMap.get(entryName) == this) {
					name = entryName;
					break;
				}
				
			}
			
		} catch (NullPointerException npe) {
			
		}
		
		return name;
		
	}
	
	/**
	 * Returns a boolean defining weather of not this entry is in a structured tree system.
	 * In other words, is it's first ancestor a "RootDirectory" object.
	 * 
	 * @return
	 */
	public boolean isInStructuredSystem() {
		return (this.getFirstAncestor() instanceof RootDirectory);
	}
	
}
