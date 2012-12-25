package com.treyzania.api.gui;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class ElementChat extends Element {

	private ArrayList<String> text = new ArrayList<String>();
	
	public ElementChat(int x, int y) {
		
		super(x, y);
		
	}

	public void addLine(String line) {
		
		text.add(line);
		
	}
	
	@Override
	public void render(Graphics2D g2d) {
		
		String lines = "";
		for ( String line : (String[]) text.toArray() ) { lines = lines + "\n" + line; }
		
		// TODO Add good handling
		
	}
	
}
