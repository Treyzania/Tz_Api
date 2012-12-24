package com.treyzania.api.util;

public class Tick {

	public final String name;
	public final long period;
	public ITick target;
	
	public long lastTick;
	public boolean enabled;
	
	public Tick(String name, ITick target, long period) {
		
		this.name = name;
		
		this.target = target;
		this.period = period;
		
		this.enabled = true;
		
	}
	
	public Tick setEnabled(boolean enabled) {
		
		this.enabled = enabled;
		return this;
		
	}
	
	public void tick() {
		
		if (target != null) target.tick();
		this.lastTick = System.currentTimeMillis();
		
	}
	
}
