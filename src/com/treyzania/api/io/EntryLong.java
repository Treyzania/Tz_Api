package com.treyzania.api.io;

public class EntryLong extends DataEntry {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6498980249788486104L;
	public long value;
	
	public EntryLong(String name, long value) {
		
		super(name);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return ".lng";
	}

}
