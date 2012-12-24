package com.treyzania.api.util;

import java.util.ArrayList;

public class TickRegistry implements Runnable {

	private Thread thread;
	private ArrayList<Tick> ticks;
	
	protected TickRegistry() {
		
		this.ticks = new ArrayList<Tick>();
		this.thread = new Thread("tz-api_TickRegistry");
		
		thread.start();
		
	}
	
	public void addTick(Tick tick) {
		
		synchronized (ticks) {
			
			ticks.add(tick);
			
		}
		
	}
	
	public void setEnabled(String name, boolean enabled) {
		
		for ( Tick tick : (Tick[]) ticks.toArray() ) {
			
			tick.setEnabled(enabled);
			
		}
		
	}
	
	@Override
	public void run() {
		
		for ( Tick tick : (Tick[]) ticks.toArray() ) {
			
			synchronized (tick) {
				
				if (tick.enabled && (tick.period + tick.lastTick) >= System.currentTimeMillis() && tick.target != null) tick.tick();
				if (tick.target == null) ticks.remove(tick);
				
			}
			
		}
		
	}

}
