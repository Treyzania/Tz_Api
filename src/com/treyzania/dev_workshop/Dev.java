package com.treyzania.dev_workshop;

import com.treyzania.api.Tz_Api;
import com.treyzania.api.io.*;

public class Dev {

	public static void main(String[] args) {
		
		Tz_Api.initalize();
		
		TreeDataFile tdf = new TreeDataFile("dev_output\\newData.tdf", false);
		
		tdf.flush();
		
		EntryCompound lastEc = tdf.getRD();
		lastEc = lastEc.setCompound("q");
		lastEc = lastEc.setCompound("w");
		lastEc = lastEc.setCompound("e");
		lastEc = lastEc.setCompound("r");
		lastEc = lastEc.setCompound("t");
		lastEc = lastEc.setCompound("y");
		lastEc.setInteger("h", 1);
		
		Entry foundEntry = tdf.getRD().getECompound("q").getECompound("w").getECompound("e").getECompound("r").getECompound("t").getECompound("y").getEntry("h");
		System.out.println(foundEntry);
		
	}
	
	
	
}
