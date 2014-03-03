package com.treyzania.api.io.treedat;

public class EntryFloat extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2870758763409909989L;
	public float value;
	
	public EntryFloat(float value) {
		this(value, null);
	}
	
	public EntryFloat(float value, EntryCompound parent) {
		
		super(parent);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".flt";
	}

}
