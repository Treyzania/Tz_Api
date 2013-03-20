package com.treyzania.api.io;

import java.util.HashMap;

public class RootDirectory extends EntryCompound implements IRoot {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2165245624318184460L;

	public RootDirectory() {
		super();
	}
	
	public void getEntryAbsolute(String path) {
		
		this.getEntryAbsolute(path.split("\\/"));
		
	}
	
	public Entry getEntryAbsolute(String[] args) {
		
		// Inits
		HashMap<String, Entry> theMap = this.entries;
		Entry finalEntry = null;
		
		for (int i = 0; i < args.length; i++) {
			
			try {
				
				Entry te = (Entry) theMap.values().toArray()[i];
				
				if (te instanceof EntryCompound) {
					
					finalEntry = te;
					
				}
				
			} catch (Exception e) {
				System.err.println("wtf?"); // Something really retarded went on...
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
