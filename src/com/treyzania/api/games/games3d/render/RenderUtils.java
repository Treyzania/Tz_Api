package com.treyzania.api.games.games3d.render;

import com.treyzania.api.games.Point2F;

public class RenderUtils {

	/**
	 * Returns if the screen percentage point given would be rendered a viewing plane.
	 * 
	 * @param point
	 * @return
	 */
	public static boolean isRendered(Point2F point) {
		return (point.x >= 0 && point.x < 1 && point.y <= 0 && point.y < 1);
	}
	
}
