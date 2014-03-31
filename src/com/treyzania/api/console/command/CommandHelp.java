package com.treyzania.api.console.command;

import java.io.PrintStream;

public class CommandHelp extends Command {

	public CommandHelp() {
		
		super("help");
		
		this.aliases.add("?");
		this.aliases.add("man");
		
	}

	@Override
	public void execute(Execution exec, PrintStream output) {
		
		if (exec.args.size() == 0) {
			
			output.println("HELP: Command not found.");
			output.println("HELP: Use -list or -l for a list of commands.");
			
		} else {
			
			if (exec.flags.contains("list") || exec.flags.contains("l")) {
				
				for (Command cmd : reg.database) {
					
					output.println(getMessage(cmd));
					output.println();
					
				}
				
			} else { // Just the one.
				
				Command helped = reg.findCommand(exec.args.get(0));
				output.println(getMessage(helped));
				
			}
			
		}
		
	}
	
	private String getMessage(Command cmd) {
		
		StringBuilder out = new StringBuilder();
		
		StringBuilder aliasList = new StringBuilder();
		for (String alias : cmd.aliases) {
			aliasList.append(" or " + alias);
		}
		
		// Print out the help listing.
		out.append(cmd.name + " (" + aliasList.toString() + " ):\n");
		out.append("\t" + cmd.helpText + "\n");
		
		return out.toString();
		
	}
	
}
