package com.treyzania.api.io;

public class EntryBoolean extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1964945146904489189L;
	
	public boolean value;

	public EntryBoolean(String name, boolean value) {
		
		super(name);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".bln";
	}

}
