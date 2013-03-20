package com.treyzania.api.io;

public class EntryObject extends DataEntry {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7243221045704165772L;
	public Object obj;
	
	public EntryObject(Object obj) {
		this(obj, null);
	}
	
	public EntryObject(Object obj, EntryCompound parent) {
		
		super(parent);
		
		this.obj = obj;
		
	}

	@Override
	public String getExtension() {
		return ".obj_" + (obj.getClass().getSimpleName().toLowerCase());
	}
	
	public Class<?> getObjClass() {
		return obj.getClass();
	}

}
