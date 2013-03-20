package com.treyzania.api.io;

public abstract class DataEntry extends Entry {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4089385277675547902L;

	public DataEntry() {
		this(null);
	}
	
	public DataEntry(EntryCompound parent) {
		super(parent);
	}

	public abstract String getExtension();
	
	@Override
	public String getFilename() {
		
		return super.getFilename() + this.getExtension();
		
	}
	
}
