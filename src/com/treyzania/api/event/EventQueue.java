package com.treyzania.api.event;

import java.util.ArrayList;

public class EventQueue {

	public ArrayList<Event> events;
	
	public EventQueue() {
		
		events = new ArrayList<Event>();
		
	}
	
	public void enqueue(Event event) {
		
		events.add(event);
		
	}
	
	public Event dequeue() {
		
		return events.remove(0);
		
	}
	
}
