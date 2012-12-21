package com.treyzania.api.gfx;

import java.awt.Color;
import java.awt.Graphics2D;

public class Theme {

	public static final Theme THEME_DEFAULT = new Theme(Color.BLACK, Color.BLACK, Color.GRAY, Color.LIGHT_GRAY, Color.BLUE);
	public static final Theme THEME_TREYZANIA = new Theme(Color.GREEN, Color.BLACK, Color.CYAN, Color.YELLOW, Color.RED);
	// TODO Add more themes.
	
	// Fields
	public Color main;
	public Color backfround;
	public Color second;
	public Color third;
	public Color text;
	
	public Theme(Color main, Color background, Color second, Color third, Color text) {
		
		this.main = main;
		this.backfround = background;
		this.second = second;
		this.third = third;
		this.text = text;
		
	}
	
	public void adaptGraphics2D(Graphics2D g2d) {
		
		g2d.setBackground(this.backfround);
		g2d.setColor(this.main);
		
		
	}
	
}
