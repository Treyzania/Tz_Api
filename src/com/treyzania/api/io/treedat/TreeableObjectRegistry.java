package com.treyzania.api.io.treedat;

import java.util.ArrayList;

public class TreeableObjectRegistry {
	
	public static ArrayList<ObjectEntryFormat> list;
	
	public static void init() {
		
		list = new ArrayList<ObjectEntryFormat>();
		
	}
	
	public static void newFormat(ITreeable theProxy) {
		
		list.add(new ObjectEntryFormat(theProxy));
		
	}
	
	public static EntryCompound getCompoundFromObject(ITreeable itree) {
		
		return itree.toEC();
		
	}
	
}
