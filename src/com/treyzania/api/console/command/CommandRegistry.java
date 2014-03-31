package com.treyzania.api.console.command;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class CommandRegistry {

	public static final char flagChar = '-';
	public static final char varChar = '+';
	
	public ArrayList<Command> database;
	
	public PrintStream outputStream;
	
	public CommandRegistry(PrintStream output) {
		
		this.database = new ArrayList<Command>();
		this.outputStream = output;
		
		// This is necessary.  Don't question it.
		this.addCommand(new CommandHelp());
		
	}
	
	public void addCommand(Command cmd) {
		
		cmd.reg = this;
		this.database.add(cmd);
		
		// Sort it to keep it organized!
		Collections.sort(this.database);
		
	}
	
	public boolean handle(String context) {
		
		Execution exec = new Execution(context);
		
		Command command = this.findCommand(exec.executedAs);
		
		if (command != null) { // Run if it's found.
			
			command.execute(exec, this.outputStream);
			return true;
			
		} else {
			return false;
		}
		
	}
	
	public Command findCommand(String cmdName) {
		
		Command command = null;
		
		for (Command cmd : database) {
			
			if (cmd.name == cmdName) { // Prioritize the true names.
				command = cmd;
				break;
			}
			
		}
		
		if (command == null) { // If it wasn't found above, check with the aliases.
			
			for (Command cmd : database) {
				
				if (cmd.aliases.contains(cmdName)) {
					command = cmd;
					break;
				}
				
			}
			
		}
		
		return command;
		
	}
	
}
