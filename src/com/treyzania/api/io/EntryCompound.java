package com.treyzania.api.io;

import java.util.ArrayList;

public class EntryCompound extends Entry implements ISubfiles, Cloneable {
	
	public ArrayList<Entry> entries;
	
	public EntryCompound(String name) {
		
		super(name);
		
		this.entries = new ArrayList<Entry>();
		
	}
	
	public boolean addEntry(Entry entry) {
		
		boolean bad = false;
		
		if (getEntry(entry.name) != null) {
			
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
		
		for (Entry entry : entries.toArray(new Entry[2 ^ 16])) {
			
			if (entry.name == name && entry != null) {
				
				e = entry;
				
			}
			
		}
		
		return e;
		
	}
	
	public String[] getEntryList_Strings() {
		
		ArrayList<String> names = new ArrayList<String>();
		
		for (int i = 0; i < entries.size(); i++) {
			
			names.add(entries.get(i).name);
			
		}
		
		return ( (String[]) names.toArray() );
		
	}
	
}
