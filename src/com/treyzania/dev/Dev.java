package com.treyzania.dev;

import java.awt.Rectangle;

import javax.swing.JFrame;

import com.treyzania.api.io.EntryCompound;
import com.treyzania.api.io.EntryString;
import com.treyzania.api.io.TreeDataFile;
import com.treyzania.api.util.Tz_Api;

public class Dev {

	public static void main(String[] args) {
		
		Tz_Api.initalize();
		
		TweakPanel tp = new TweakPanel();
		JFrame frame = new JFrame();
		
		frame.setBounds(new Rectangle(0, 0, 500, 500));
		frame.setFocusable(true);
		frame.setVisible(true);
		frame.add(tp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		while (true) {
			
			tp.repaint();
			
		}
		
	}
	
	
	
}
