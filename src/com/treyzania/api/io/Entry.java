package com.treyzania.api.io;

import java.io.Serializable;

public abstract class Entry extends Object implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3918712224031370634L;
	
	protected String name;
	
	public Entry(String name) {
		
		this.name = name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getFilename() {
		
		return this.name;
		
	}
	
}
