package com.treyzania.api.io;

public class EntryObject extends DataEntry {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1619588542120208291L;

	public Object obj;
	
	public EntryObject(String name, Object obj) {
		
		super(name);
		
		
	}

	@Override
	public String getExtension() {
		return ".obj_" + obj.getClass();
	}
	
	public Class<?> getObjClass() {
		return obj.getClass();
	}

}
