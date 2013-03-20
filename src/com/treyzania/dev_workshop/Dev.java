package com.treyzania.dev_workshop;

import com.treyzania.api.Tz_Api;
import com.treyzania.api.io.*;

public class Dev {

	public static void main(String[] args) {
		
		Tz_Api.initalize();
		
		TreeDataFile tdf = new TreeDataFile("data.tdf", false);
		
		tdf.flush();
		//tdf.read();
		
		System.out.println(tdf.getRD().getEntry("q/w/e/r/t/y/h.int"));
		
	}
	
	
	
}
