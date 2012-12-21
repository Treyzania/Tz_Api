package com.treyzania.api.util;

import java.awt.Color;
import java.awt.Graphics2D;

import com.treyzania.api.gfx.Element;

public class ElementBarThin extends Element {

	public Color bar;
	public Color slider;
	public int max = 0;
	public int current = 0;
	public float scalingRatio = 1.0F;
	public boolean write;
	public String name;
	
	public ElementBarThin(Color bar, Color slider, float ratio, boolean write, String text) {
		
		this.bar = bar;
		this.slider = slider;
		
		this.scalingRatio = ratio;
		this.write = write;
		this.name = text;
		
	}
	
	public void setValue(int value) {
		
		this.current = value;
		
	}
	
	public void setMaximum(int max) {
		
		this.max = max;
		
	}
	
	public void setScalingRatio(float ratio) {
		
		this.scalingRatio = ratio;
		
	}
	
	/*public float autoAdjustRatio(int length) {
		
		this.scalingRatio = length / max;
		return this.scalingRatio;
		
	}*/
	
	@Override
	public void render(Graphics2D g2d, int x, int y) {
		
		// Inits
		int pointAdj = (int) (current * scalingRatio);
		int maxAdj = (int) (max * scalingRatio);
		int percentage = (int) (( ( (float) current) / ( (float) max) ) * 100);
		
		int barStart_X = x;
		int barStart_Y = y + 5;
		int barEnd_X = x + maxAdj;
		int barEnd_Y = y + 5;
		
		int sliderStart_X = x + pointAdj;
		int sliderStart_Y = y;
		int sliderEnd_X = x + pointAdj;
		int sliderEnd_Y = y + 11;
		
		// Renders
		g2d.setColor(this.bar);
		g2d.drawLine(barStart_X, barStart_Y, barEnd_X, barEnd_Y); // Bar
		g2d.setColor(this.slider);
		g2d.drawLine(sliderStart_X, sliderStart_Y, sliderEnd_X, sliderEnd_Y); // Slider
		if (write) {
			g2d.setColor(ResourceRegistry.currentTheme.text);
			g2d.drawString(name + ": " + current + " / " + max + " ( " + percentage + "% )", x, y - 5);
		}
		
		// Reset
		ResourceRegistry.currentTheme.adaptGraphics2D(g2d);
		
	}
	
}
