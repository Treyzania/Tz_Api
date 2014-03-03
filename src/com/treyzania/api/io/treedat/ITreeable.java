package com.treyzania.api.io.treedat;

public interface ITreeable {
	
	public Object duplicate();
	
	public void adapt(EntryCompound ec);
	public EntryCompound toEC();
	
}
