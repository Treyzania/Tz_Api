package com.treyzania.api.io.treedat;

public class EntryInteger extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2724919489480505555L;
	public int value;
	
	public EntryInteger(int value) {
		this(value, null);
	}
	
	public EntryInteger(int value, EntryCompound parent) {
		
		super(parent);
		
		this.value = value;
		
	}
	
	@Override
	public String getExtension() {
		return ".int";
	}

}
