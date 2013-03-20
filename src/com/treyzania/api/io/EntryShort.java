package com.treyzania.api.io;

public class EntryShort extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2330180123966054647L;
	public short value;
	
	public EntryShort(short value) {
		this(value, null);
	}
	
	public EntryShort(short value, EntryCompound parent) {
		
		super(parent);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".srt";
	}

}
