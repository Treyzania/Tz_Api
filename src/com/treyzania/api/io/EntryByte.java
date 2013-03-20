package com.treyzania.api.io;

public class EntryByte extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5134032906758702970L;
	public byte value;
	
	public EntryByte(byte value) {
		this(value, null);
	}
	
	public EntryByte(byte value, EntryCompound parent) {
		
		super(parent);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".byt";
	}

}
