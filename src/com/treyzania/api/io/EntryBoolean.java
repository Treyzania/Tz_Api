package com.treyzania.api.io;

public class EntryBoolean extends DataEntry {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5826922488514035547L;
	public boolean value;

	public EntryBoolean(boolean value) {
		this(value, null);
	}
	
	public EntryBoolean(boolean value, EntryCompound parent) {
		
		super(parent);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".bln";
	}

}
