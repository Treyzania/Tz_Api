package com.treyzania.api.io;

import java.util.ArrayList;

public class EntryCompound extends Entry implements ISubfiles, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7502677689202547100L;
	
	public ArrayList<Entry> entries;
	
	public EntryCompound(String name) {
		
		super(name);
		
		this.entries = new ArrayList<Entry>();
		
	}
	
	public boolean addEntry(Entry entry) {
		
		boolean bad = false;
		
		if (getEntry(entry.name) != null) { // Check if the filename already exists 
			bad = true;
		} else {
			entries.add(entry);
		}
		
		return bad;
		
	}
	
	public Entry getEntry(int i) {
		
		return entries.get(i);
		
	}
	
	public Entry getEntry(String name) {
		
		Entry e = null;
		
		for (Entry entry : entries ) {
			
			if (entry != null) {
				
				if (entry.getFilename() == name) {
					
					e = entry;
					
				}
				
			}
			
		}
		
		return e;
		
	}
	
	public String[] getEntryList_Strings() {
		
		ArrayList<String> names = new ArrayList<String>();
		
		for (int i = 0; i < entries.size(); i++) {
			
			names.add(entries.get(i).getFilename());
			
		}
		
		return ( (String[]) names.toArray() );
		
	}
	
}
