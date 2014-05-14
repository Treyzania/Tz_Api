package com.treyzania.api.games.games3d.render.plotting;

import com.treyzania.api.games.games3d.render.IViewpointProvider;

public interface IUsesAdvancedRenderingControl {

	public void setViewpointProvider(IViewpointProvider provider);
	public IViewpointProvider getProvider();
	
	public void setFOV_X(float fovX);
	public void setFOV_Y(float fovY);
	
	public float getFOV_X();
	public float getFOV_Y();
	
}
