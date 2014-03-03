package com.treyzania.api.io.treedat;

import java.util.HashMap;

public class RootDirectory extends EntryCompound implements IRoot {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2165245624318184460L;

	public RootDirectory() {
		super();
	}
	
	/**
	 * A more easily-used call of the EntryFinder.
	 * 
	 * @param path
	 */
	public Entry getEntryAbsolute(String path) {
		
		if (path.charAt(0) != '/') return null;
		
		return this.getEntryAbsolute(path.split("\\/"));
	}
	
	/**
	 * Find the entry specified.  Dificult to write.
	 * 
	 * "EntryFinder" (Version 4.1)
	 * 
	 * @param args
	 * @return
	 */
	public Entry getEntryAbsolute(String[] args) {
		
		// Inits
		HashMap<String, Entry> theMap = this.entries;
		Entry finalEntry = null;
		
		// Dah Loopz!
		for (int i = 0; i < args.length; i++) {
			
			try {
				
				Entry te = (Entry) theMap.values().toArray()[i];
				if (te instanceof EntryCompound) {
					finalEntry = te;
				}
				
			} catch (Exception e) {
				System.err.println("wtf?"); // Something really retarded must've went on...
				finalEntry = null;
				break;
			}
			
		}
		
		return finalEntry;
		
	}
	
	@Override
	public boolean isInStructuredSystem() {
		return true;
	}

}
