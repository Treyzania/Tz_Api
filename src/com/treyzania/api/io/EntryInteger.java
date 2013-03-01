package com.treyzania.api.io;

public class EntryInteger extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7772363472686340422L;
	
	public int value;
	
	public EntryInteger(String name, int value) {
		
		super(name);
		
		this.value = value;
		
	}
	
	@Override
	public String getExtension() {
		return ".int";
	}

}
