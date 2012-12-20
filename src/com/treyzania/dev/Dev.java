package com.treyzania.dev;

import com.treyzania.api.io.EntryCompound;
import com.treyzania.api.io.EntryString;
import com.treyzania.api.io.TreeDataFile;

public class Dev {

	public static void main(String[] args) {
		
		TreeDataFile tdf = new TreeDataFile("C:\\Java_Play\\test", false);
		EntryCompound ec = new EntryCompound("test");
		ec.addEntry(new EntryString("string", "TEST"));
		
		tdf.addEntry(ec);
		tdf.flush();
		
		String[] stringArray = {"test"};
		EntryCompound ec2 = (EntryCompound) tdf.getEntryFromPath(stringArray);
		String[] names = ec2.getEntryList_Strings();
		
		for (int i = 0; i < names.length; i++) {
			
			System.out.println(names[i]);
			
			
		}
		
	}
	
	
	
}
