package com.treyzania.api.games.games3d;


public class Environment3D {

	public double windResistance;
	public double gravityFactor;
	
	public double x_drift, y_drift; // TODO Add drift calculations
	private double termainalVelocity;
	
	public Environment3D(double windResistance, double gravityFactor) {
		
		this.windResistance = windResistance;
		this.gravityFactor = gravityFactor;
		
		this.x_drift = 0;
		this.y_drift = 0;
		
	}
	
	@SuppressWarnings("unused")
	public void calculateNewLocation(EntityEnv3D entity, boolean chgCoords) {
		
		// Inits
		double old_x = entity.x;
		double old_y = entity.y;
		double old_z = entity.z;
		double old_xVel = entity.xVel;
		double old_yVel = entity.yVel;
		double old_zVel = entity.zVel;
		double terminalVelocity = entity.terminalVelocity;
		
		// X calculation.
		double xVel = old_xVel;
		xVel *= windResistance;
		if (Math.abs(xVel) > termainalVelocity) xVel *= 0.9F;
		
		// Y calculation.
		double yVel = old_yVel;
		yVel *= windResistance;
		if (Math.abs(yVel) > termainalVelocity) yVel *= 0.9F;
		
		// Z calculation, more complex than X or Y.
		double zVel = old_zVel;
		zVel *= windResistance * ( gravityFactor + 1 );
		if (Math.abs(zVel) > termainalVelocity) zVel *= 0.9F;
		
		// Optional velocity-coordinate application
		double x = old_x;
		double y = old_y;
		double z = old_z;
		if (chgCoords) {
			x += xVel;
			y += yVel;
			z += zVel;
		}
		
		// Finalize all changes
		entity.setMovementAttr(x, xVel, y, yVel, z, zVel);
		
	}
	
	
}
