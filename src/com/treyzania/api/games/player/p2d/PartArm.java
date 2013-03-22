package com.treyzania.api.games.player.p2d;

import java.awt.Graphics2D;

import com.treyzania.api.games.content.entity.Entity;

public class PartArm extends Bodypart2D implements Runnable {
	
	int angle;
	int length;
	
	int extendingTo, extendingBy;
	
	public PartArm(double x, double y, int angle, int length) {
		
		super(x, y);
		
	}
	
	public void extendTo(int end, int speed) {
		
		this.extendingTo = end;
		this.extendingBy = speed;
		
	}
	
	// TODO Check if this works.
	@Override
	public void run() {
		
		while (extendingBy < 0 ? angle <= extendingTo : angle >= extendingTo) {
			
			// Calculating movements.
			if (extendingBy < 0) {
				
				angle += extendingBy;
				
			} else if (extendingBy > 0) {
				
				angle -= extendingBy;
				
			}
			
			// Checking if done.
			if (Math.abs(angle) < Math.abs(extendingTo)) {
				angle = extendingTo;
				break;
			}
			
		}
		
	}

	@Override
	public void render(Graphics2D g2d, Entity ep) {
		
		// TODO Add rendering code.
		
	}
	
}
