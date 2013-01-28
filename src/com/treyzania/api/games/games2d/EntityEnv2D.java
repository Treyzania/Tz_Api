package com.treyzania.api.games.games2d;

import com.treyzania.api.games.games2d.old.Model;

public class EntityEnv2D extends Entity2D implements IPhysicsAccess2D {

	public double xVel, yVel;
	public double terminalVel;
	public boolean onGround, inWater;
	
	public EntityEnv2D(String name, Model model) {
		
		super(name, model);
		
	}
	
	public void tryJump() {
		
		
		
	}
	
	@Override
	public void setX(double x) {
		this.x = x;
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public void setXVel(double x) {
		this.xVel = x;
	}

	@Override
	public double getXVel() {
		return xVel;
	}

	@Override
	public void setYVel(double y) {
		this.yVel = y;
	}

	@Override
	public double getYVel() {
		return yVel;
	}

	@Override
	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}

	@Override
	public boolean getOnGround() {
		return onGround;
	}

	@Override
	public boolean getInWater() {
		return inWater;
	}

	@Override
	public double getTerminalVelocity() {
		return terminalVel;
	}
	
}
