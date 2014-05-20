package com.treyzania.api.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;

/**
 * Register an instance of class with a JFrame, then use it for standard input if you so wish. 
 * 
 * @author Treyzania
 *
 */
public class Keyboard implements KeyListener {

	private HashMap<Integer, Boolean> keyStates;
	
	public Keyboard() {
		
		this.keyStates = new HashMap<Integer, Boolean>();
		
	}
	
	/**
	 * Returns <code>true</code> if the key is being pressed, <code>false</code> if otherwise.
	 * 
	 * @param keycode
	 * @return
	 */
	public boolean isKeyDown(int keycode) {
		return this.keyStates.getOrDefault(keycode, false);
	}
	
	@Override
	public void keyPressed(KeyEvent ke) {
		this.keyStates.put(ke.getKeyCode(), true);
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		this.keyStates.put(ke.getKeyCode(), false);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// Not a whole lot to do.
	}

}
