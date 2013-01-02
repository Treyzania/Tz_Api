package com.treyzania.api.io;

public class EntryFloat extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4161600820857960960L;

	public float value;
	
	public EntryFloat(String name, float value) {
		
		super(name);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".flt";
	}

}
