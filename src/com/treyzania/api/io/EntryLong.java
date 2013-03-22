package com.treyzania.api.io;

public class EntryLong extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6498980249788486104L;
	public long value;
	
	public EntryLong(long value) {
		this(value, null);
	}
	
	public EntryLong(long value, EntryCompound parent) {
		
		super(parent);
		
		this.value = value;
		
	}

	@Override
	public String getExtension() {
		return ".lng";
	}

}
