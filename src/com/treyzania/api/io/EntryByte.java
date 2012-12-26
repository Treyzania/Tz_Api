package com.treyzania.api.io;

public class EntryByte extends BasicEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4722685329077150872L;

	public byte value;
	
	public EntryByte(String name, byte value) {
		
		super(name);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".byt";
	}

}
