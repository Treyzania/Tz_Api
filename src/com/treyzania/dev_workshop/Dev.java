package com.treyzania.dev_workshop;

import com.treyzania.api.Tz_Api;
import com.treyzania.api.io.*;

public class Dev {

	public static void main(String[] args) {
		
		Tz_Api.initalize();
		
		TreeDataFile tdf = new TreeDataFile("data.tdf", false);
		
		tdf.flush();
		//tdf.read();
		
		EntryCompound ec = new EntryCompound("one");
		ec.addEntry(new EntryInteger("numb", 5));
		
		tdf.addEntry(ec);
		
		System.out.println(tdf.getEntryFromPath(new String[] {"one", "numb.int"}));
		
	}
	
	
	
}
