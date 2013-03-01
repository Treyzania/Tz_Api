package com.treyzania.api.io;

public class ObjectEntryFormat {
	
	ITreeable itreeable;
	
	public ObjectEntryFormat(ITreeable itree) {
		
		this.itreeable = itree;
		
	}
	
	public Object formatNewObject(EntryCompound ec) {
		
		ITreeable output = (ITreeable) itreeable.duplicate();
		output.adapt(ec);
		
		return output;
		
	}
	
}
