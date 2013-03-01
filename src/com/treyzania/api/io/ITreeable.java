package com.treyzania.api.io;

public interface ITreeable {
	
	public Object duplicate();
	
	public void adapt(EntryCompound ec);
	public EntryCompound toEC();
	
}
