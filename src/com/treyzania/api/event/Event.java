package com.treyzania.api.event;

import com.treyzania.api.io.EntryCompound;

public class Event {

	private String name;
	private EntryCompound data;
	
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
	
}
