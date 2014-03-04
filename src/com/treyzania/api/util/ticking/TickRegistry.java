package com.treyzania.api.util.ticking;

import java.util.ArrayList;


public class TickRegistry implements Runnable {

	private static TickRegistry ticker = new TickRegistry();
	
	private Thread thread;
	private ArrayList<Tick> ticks;
	protected volatile boolean ticking;
	
	protected TickRegistry() {
		
		this.ticks = new ArrayList<Tick>();
		this.thread = new Thread(this, "TzApi-TickRegistry");
		this.ticking = true;
		
		thread.start();
		
	}
	
	/**
	 * Adds an entry to the list of ticks.
	 * 
	 * @param tick
	 * @param name
	 * @param period
	 */
	public static void registerTick(ITick tick, String name, long period) {
		
		ticker.addTick(new Tick(name, tick, period));
		
	}
	
	/**
	 * Enables/disables a tick entry.
	 * 
	 * @param name
	 * @param enabled
	 */
	public static void setTickEnabled(String name, boolean enabled) {
		
		ticker.setEnabled(name, enabled);
		
	}
	
	/**
	 * Weather or not to do any ticking.
	 * NOTE: This will stop all GPanels from repaint()-ing if no other outside ticker is made. 
	 * 
	 * @param ticking
	 */

	public static void setTicking(boolean ticking) {
		
		ticker.ticking = ticking;
		
	}
	
	protected static TickRegistry getTicker() {
		
		return ticker;
		
	}
	
	private void addTick(Tick tick) {
		
		synchronized (ticks) {
			
			ticks.add(tick);
			
		}
		
	}
	
	private void setEnabled(String name, boolean enabled) {
		
		for ( Tick tick : ticks ) {
			
			tick.setEnabled(enabled);
			
		}
		
	}
	
	
	
	@Override
	public void run() {
		
		while (true) {
			
			if (ticking) {
				
				for ( Tick tick : ticks ) {
					
					synchronized (tick) {
						
						if (tick.enabled && (tick.period + tick.lastTick) >= System.currentTimeMillis() && tick.target != null) tick.tick();
						if (tick.target == null) ticks.remove(tick);
						
					}
					
				}
				
			}
			
		}
		
	}

}
