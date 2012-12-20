package com.treyzania.api.io;

public class EntryString extends Entry implements IBasicEntry {

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
