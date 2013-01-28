package com.treyzania.api.games.games3d;


public class EntityEnv3D extends Entity3D {

	public double xVel = 0;
	public double yVel = 0;
	public double zVel = 0;
	public double terminalVelocity;
	
	public EntityEnv3D(String name, double terminalVelocity) {
		
		super(name);
		
		this.terminalVelocity = terminalVelocity;
		
	}
	
	/**
	 * Used in movement calculations.
	 * 
	 * @param x
	 * @param xVel
	 * @param y
	 * @param yVel
	 * @param z
	 * @param zVel
	 */
	public void setMovementAttr(double x, double xVel, double y, double yVel, double z, double zVel) {
		
		this.x = x;
		this.xVel = xVel;
		
		this.y = y;
		this.yVel = yVel;
		
		this.z = z;
		this.zVel = zVel;
		
	}
	
	/**
	 * Adds to the X velocity.
	 * 
	 * @param x
	 */
	public void addXVel(double x) {
		
		this.xVel += x;
		
	}
	
	/**
	 * Adds to the Y velocity.
	 * 
	 * @param y
	 */
	public void addYVel(double y) {
		
		this.yVel += y;
		
	}
	
	/**
	 * Adds to the Z (vertical) velocity.
	 * 
	 * @param z
	 */
	public void addZVel(double z) {
		
		this.zVel += z;
		
	}
	
	/**
	 * Slows down/speeds up the entity.  It multiplies all 3 velocity values by the double passed.
	 * 
	 * @param factor
	 */
	public void velocityMultiply(double factor) {
		
		this.xVel *= factor;
		this.yVel *= factor;
		this.zVel *= factor;
		
	}
	
	/**
	 * Stops the entity's movement altogether.  Sets the velocity values to 0;
	 */
	public void stop() {
		
		this.velocityMultiply(0.0D);
		
	}
	
}
