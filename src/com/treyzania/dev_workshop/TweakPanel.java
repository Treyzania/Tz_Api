package com.treyzania.dev_workshop;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import com.treyzania.api.gui.ElementBarThin;

public class TweakPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {		
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawLine(0, 0, 10, 10);
		
		ElementBarThin ebt = new ElementBarThin(50, 50, Color.BLACK, Color.GREEN);
		ebt.setMaximum(100);
		ebt.setValue(100);
		
		ebt.setAttribs(1.0F, true, "Hi", Color.BLACK, true, true);
		
		ebt.render(g2d);
		
		
		
	}
	
	
}
