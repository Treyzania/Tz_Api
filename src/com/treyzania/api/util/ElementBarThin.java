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
	public String name;
	
	public ElementBarThin(Color bar, Color slider, float ratio, String text) {
		
		this.bar = bar;
		this.slider = slider;
		
		this.scalingRatio = ratio;
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
	
	public float autoAdjustRatio(int length) {
		
		this.scalingRatio = this.max / length;
		return this.scalingRatio;
		
	}
	
	@Override
	public void render(Graphics2D g2d, int x, int y) {
		
		// Inits
		int point = (int) (max * scalingRatio);
		
		int barStart_X = x;
		int barStart_Y = y - 5;
		int barEnd_X = 0;
		int barEnd_Y = y - 5;
		
		
		// Renders
		
		g2d.drawLine(barStart_X, barStart_Y, barEnd_X, barEnd_Y);
		
	}
	
}
