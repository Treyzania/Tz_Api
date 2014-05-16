package com.treyzania.api.games.games3d.render.plotting;

import com.treyzania.api.games.Point2F;
import com.treyzania.api.games.Point3F;
import com.treyzania.api.games.Vector3F;
import com.treyzania.api.games.games3d.render.IViewpointProvider;
import static java.lang.Math.tan;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.sqrt;

/**
 * This class took me a very long time to design as the concepts I use I did not understand when
 * I was initially developing the idea.  I have been working on these concepts for about 16 months
 * on and off...<br/><br/>
 * 
 * It is a plotter that works in virtually any configuration.  It may be better to use doubles
 * instead of floats and avoid all the casting, however this would use less memory, I think.<br/><br/>
 * 
 * Please give some suggestions if there is something you have an idea for.  I'm not super-
 * proficient in Trig and Math.class.
 * 
 * @author Treyzania
 *
 */
public class PlotterProjectionPerspective_Gamma extends Plotter implements IUsesAdvancedRenderingControl {

	private IViewpointProvider ivp = null;
	private float fovX = 1F;
	private float fovY = 1F;
	
	@Override
	public Point2F plot(Point3F op) {
		
		Vector3F vec = ivp.getViewpoint();
		
		// Setup
		float factorX = 0F;
		float factorY = 0F;
		
		if (!op.equals(vec.base)) { // Check if the point being plotted is at the same point as the vector's base.
			
			// Do the primary shifts and scalings.
			float xDiff = op.x - vec.base.x;
			if (xDiff != 0) {
				
				// Only if the point is not on the viewing vector's plane.  Is subtraction right here?
				factorX = (float) (cotan((op.z - vec.base.z) / xDiff) - vec.getYaw_rads()) / fovX;
				factorY = (float) (cotan((op.y - vec.base.y) / xDiff) - vec.getPitch_rads()) / fovY;
				
			} else { // In this case, figure out the angle, but differently.
				
				factorX = 0F; // It should return 0 anyways (, I think.)
				factorY = (float) (Math.atan2(op.x - vec.base.x, op.y - vec.base.y) - vec.getPitch_rads()) / fovY; // I hope this is right.
				
			}
			
			/* Adjust for roll...  (No, the 'q' after "polar" isn't a typo, I don't know
			 * why I have it, but it's important.  0.000001 is 0.001^2; in this form it
			 * is slightly easier to compute.)
			 */
			float polarqR_sq = (float) (pow(factorX, 2) + pow(factorY, 2));
			if (polarqR_sq >= 0.000001F && vec.roll != 0) { // In this case, it doesn't matter what the roll is measued in.
				
				float adjTheta = (float) (cotan(factorY / factorX) - vec.getRoll_rads()); // Here, the measurement does matter.
				
				double polarqR = sqrt(polarqR_sq); // Is this alright?
				factorX = (float) (cos(adjTheta) * polarqR * -1);
				factorX = (float) (sin(adjTheta) * polarqR * -1);
				
			}
			
		} // Otherwise, nothing happens...  It just renders in the center of the screen, by default.
		
		/* The +0.5F part is to make it easier/cleaner to scale up to a valid resolution like 1280x720,
		 * you'd just multiply the coordinates by the numbers using Point2F:multiply(). 
		 */
		return new Point2F(factorX + 0.5F, factorY + 0.5F);
		
	}
	
	@Override
	public void setViewpointProvider(IViewpointProvider provider) {
		this.ivp = provider;
	}
	
	@Override
	public IViewpointProvider getProvider() {
		return ivp;
	}
	
	@Override
	public void setFOV_X(float fovX) {
		this.fovX = fovX % 360;
	}
	
	@Override
	public void setFOV_Y(float fovY) {
		this.fovY = fovY % 360;
	}
	
	@Override
	public float getFOV_X() {
		return this.fovX;
	}
	
	@Override
	public float getFOV_Y() {
		return this.fovY;
	}
	
	/**
	 * This may or may not be already implemented elsewhere...
	 * 
	 * @param value
	 * @return
	 */
	private static double cotan(double value) {
		return 1.0F / tan(value);
	}
	
}
