package com.treyzania.api.games.games2d;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Bounds {

	private final ArrayList<Rectangle> rects;
	
	public Bounds() {
		
		rects = new ArrayList<Rectangle>();
		
	}
	
	public void addRect(Rectangle r) {
		
		rects.add(r);
		
	}
	
	public Rectangle getRect(int numb) {
		
		return rects.get(numb);
		
	}
	
	protected ArrayList<Rectangle> getRectList() {
		
		return rects;
		
	}
	
	public boolean intersects(Bounds bl) {
		
		boolean bad = false;
		ArrayList<Rectangle> bll = bl.getRectList();
		
		for (int i = 0; i < rects.size(); i++) {
			
			for (int j = 0; j < bll.size(); j++) {
				
				Rectangle r1 = rects.get(i);
				Rectangle r2 = rects.get(j);
				
				if (r1.intersects(r2)) {
					
					bad = true;
					
				}
				
			}
			
		}
		
		return bad;
		
	}
	
}
