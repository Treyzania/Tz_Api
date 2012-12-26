package com.treyzania.api.io;

public class EntryString extends BasicEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5473156936195530569L;
	
	public String value = "";
	
	public EntryString(String name, String value) {
		
		super(name);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".str";
	}

}
