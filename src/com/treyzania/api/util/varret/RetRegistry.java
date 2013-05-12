package com.treyzania.api.util.varret;

import java.util.HashMap;

import com.treyzania.api.io.DataEntry;

/**
 * Shirt for "RetrievableRegistry".
 * 
 * @author Treyzania
 *
 */
public class RetRegistry {

	public static HashMap<String, IRetableVars> objects;
	
	public static void registerImplementation(String key, IRetableVars irv) {
		
		objects.put(key, irv);
		
	}
	
	public static IRetableVars getImplementation(String impl) {
		
		return objects.get(impl);
		
	}
	
	public static void setVar(String index, DataEntry de) {
		
		String[] parts = index.split("\\.");
		getImplementation(parts[0]).setVar(parts[1], de);
		
	}
	
	public static DataEntry getVar(String index) {
		
		String[] parts = index.split("\\.");
		return objects.get(parts[0]).getVar(parts[1]);
		
	}
	
}
