package com.treyzania.api.games.games2d;

public interface IPhysicsAccess2D {

	public void setX(double x);
	public double getX();
	
	public void setY(double y);
	public double getY();
	
	public void setXVel(double x);
	public double getXVel();
	
	public void setYVel(double y);
	public double getYVel();
	
	public void setOnGround(boolean onGround);
	public boolean getOnGround();
	
	public boolean getInWater();
	
	public double getTerminalVelocity();
	
}
