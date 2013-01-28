package com.treyzania.api.event;

import com.treyzania.api.io.EntryCompound;

public class Event {

	private final String name;
	private final EntryCompound data;
	private final long timestamp = System.currentTimeMillis();
	
	public Event(String name, EntryCompound data) {
		
		this.name = name;
		this.data = data;
		
	}
	
	public EntryCompound extractData(){
		
		return data;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public long timestamp() {
		
		return timestamp;
		
	}
	
}
