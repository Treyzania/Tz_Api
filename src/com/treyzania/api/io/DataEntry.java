package com.treyzania.api.io;

public abstract class DataEntry extends Entry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 917001827264843540L;

	public DataEntry(String name) {
		
		super(name);
		
	}

	public abstract String getExtension();
	
	@Override
	public String getFilename() {
		
		return this.name + getExtension();
		
	}
	
}
