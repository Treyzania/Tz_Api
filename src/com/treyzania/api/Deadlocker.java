package com.treyzania.api;

public class Deadlocker {

	/**
	 * Should, *should* cause a bit of deadlock in the VM.
	 * 
	 * I was bored an have no idea why I did this.
	 * 
	 * Let me know how I can improve this.
	 * 
	 * @param millis
	 */
	public static void deadlock(long millis) {
		
		System.out.println("IMMA DEADLOCK U!!!!!!!SHIFT+1!!!!");
		
		synchronized (Object.class) {
			
			synchronized (System.class) {
				
				try {
					Thread.sleep(millis);
				} catch (InterruptedException e) { }
				
			}
			
		}
		
		System.out.println("ok, I'm done!");
		
	}
	
	/**
	 * Calls "deadlock(long)" for 1,000,000,000,000 milliseconds.  That is about 16,666,666 minutes.
	 * Should be enough to do some bad things to some stuff. 
	 * 
	 */
	public static void deadlock() {
		
		deadlock(1000000000000L);
		
	}
	
}
