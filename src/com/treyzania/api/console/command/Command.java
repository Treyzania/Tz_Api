package com.treyzania.api.console.command;

import java.io.PrintStream;
import java.util.ArrayList;

public abstract class Command implements Comparable<Command> {

	public CommandRegistry reg;
	
	public String name;
	public ArrayList<String> aliases;
	
	public String helpText = "";
	
	public Command(String name) {
		
		this.name = name;
		this.aliases = new ArrayList<String>();
		
	}
	
	public abstract void execute(Execution exec, PrintStream output);
	
	@Override
	public int compareTo(Command other) {
		return this.name.compareToIgnoreCase(other.name);
	}
}
