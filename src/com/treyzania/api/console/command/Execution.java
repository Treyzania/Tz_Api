package com.treyzania.api.console.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Execution {

	public String executedAs;
	public ArrayList<String> flags;
	public HashMap<String, String> vars;
	
	public ArrayList<String> args;
	
	public Execution(String context) {
		
		String[] parts = context.split(" ");
		this.executedAs = parts[0];
		
		List<String> postnames = Arrays.asList(parts);
		for (int i = 1; i < postnames.size(); i++) {
			
			String part = postnames.get(i);
			
			if (part.charAt(0) == CommandRegistry.flagChar) { // As in "foo -bar".
				
				flags.add(part.substring(1));
				
			} else if (part.charAt(0) == CommandRegistry.varChar) { // As in "foo +alice=Bob".
				
				String[] contents = part.substring(1).split("=");
				
				if (contents.length == 2) {
					
					String varName = contents[0];
					String varVal = contents[1];
					
					vars.put(varName, varVal);
					
				}
				
			} else { // As in "apt-get upgrade".
				
				args.add(part);
				
			}
			
		}
		
	}
	
}
