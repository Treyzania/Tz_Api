package com.treyzania.dev;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.treyzania.api.util.ElementBarThin;

public class TweakPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {		
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawLine(0, 0, 10, 10);
		
		ElementBarThin ebt = new ElementBarThin(Color.BLACK, Color.GREEN, 1.0F, true,"<Test>");
		ebt.setMaximum(75);
		ebt.setValue(100);
		
		ebt.render(g2d, 50, 50);
		
	}
	
	
}
