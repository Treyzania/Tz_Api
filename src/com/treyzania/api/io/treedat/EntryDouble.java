package com.treyzania.api.io.treedat;

public class EntryDouble extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2703936849236417400L;
	public double value;
	
	public EntryDouble(double value) {
		this(value, null);
	}
	
	public EntryDouble(double value, EntryCompound parent) {
		
		super(parent);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".dbl";
	}

}
