package com.treyzania.api.io;

public abstract class BasicEntry extends Entry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 917001827264843540L;

	public BasicEntry(String name) {
		
		super(name);
		
	}

	public abstract String getExtension();
	
}
