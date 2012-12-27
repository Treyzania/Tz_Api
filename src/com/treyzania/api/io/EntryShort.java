package com.treyzania.api.io;

public class EntryShort extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4742210915177412580L;

	public short value;
	
	public EntryShort(String name, short value) {
		
		super(name);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".srt";
	}

}
