package com.treyzania.api.io;

public class EntryDouble extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = -368446041097464753L;

	public double value;
	
	public EntryDouble(String name, double value) {
		
		super(name);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".dbl";
	}

}
