package com.treyzania.api.games.games2d;


public class Environment2D {
	
	public float vert_windResistance;
	public float hor_windResistance;
	
	public float gravityFactor;
	
	public Environment2D() {
		
		this.vert_windResistance = 0F;
		this.hor_windResistance = 0F;
		
		this.gravityFactor = 0.0F;
		
	}
	
	/**
	 * Updates the entity's location. (Via IEntPhysicsAccess2D.)
	 * 
	 * @param entity
	 */
	public void updateVelocity(IPhysicsAccess2D entity) {
		
		double x = entity.getX();
		double y = entity.getY();
		
		double xVel = entity.getXVel();
		double yVel = entity.getYVel();
		
		double nextX = x;
		double nextY = y;
		
		xVel = xVel * hor_windResistance;
		yVel = (yVel * vert_windResistance) + gravityFactor;
		
		if (entity.getInWater()) {
			yVel *= 0.25;
		}
		
		double absVel = entity.getXVel() + entity.getYVel();
		
		if (absVel < entity.getTerminalVelocity()) {
			xVel *= 0.99;
			yVel *= 0.99;
			
		}
		
		if (entity.getOnGround()) {
			xVel *= 0.5;
			yVel = 0;
		}
		
		nextX += xVel;
		nextY += yVel;
		
		entity.setX(nextX);
		entity.setY(nextY);
		
		entity.setXVel(xVel);
		entity.setYVel(yVel);
		
	}
	
}
