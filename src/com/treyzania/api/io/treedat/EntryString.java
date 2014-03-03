package com.treyzania.api.io.treedat;

public class EntryString extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5722684474701125600L;
	public String value = "";
	
	public EntryString(String value) {
		this(value, null);
	}
	
	public EntryString(String value, EntryCompound parent) {
		
		super(parent);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".str";
	}

}
