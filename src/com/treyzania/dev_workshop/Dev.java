package com.treyzania.dev_workshop;

import com.treyzania.api.io.*;
import com.treyzania.api.util.Tz_Api;

public class Dev {

	public static void main(String[] args) {
		
		Tz_Api.initalize();
		
		TreeDataFile tdf = new TreeDataFile("data.tdf", false);
		
		tdf.flush();
		tdf.read();
		
	}
	
	
	
}
