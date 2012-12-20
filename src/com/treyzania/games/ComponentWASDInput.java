package com.treyzania.games;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;

public class ComponentWASDInput extends JComponent implements ActionListener {

	/**
	 * This class is for getting keyboard input, created for use with a com.treyzania.infinitecombat.src.WorldRenderer
	 * which renders out a com.treyzania.infinitecombat.World object, terrain, com.treyzania.games.simple2d.EntityAbsoulte2D, and all...
	 */
	private static final long serialVersionUID = 8031707456852123762L;
	
	public boolean[] keys;
	
	public ComponentWASDInput() {
		
		this.addKeyListener(new KA());
		this.keys = new boolean[256];
		
		System.out.println("Adding a WASDInput, Hash code: " + this.hashCode());
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
	}
	
	public boolean getSpace() { return keys[0]; }
	public boolean getW() { return keys[1]; }
	public boolean getA() {	return keys[2];	}
	public boolean getS() {	return keys[3]; }
	public boolean getD() {	return keys[4]; }
	public boolean getShift() {	return keys[5]; }
	public boolean getNum0() { return keys[6]; }
	public boolean getNum1() { return keys[7]; }
	public boolean getNum2() { return keys[8]; }
	public boolean getNum3() { return keys[9]; }
	public boolean getNum4() { return keys[10]; }
	public boolean getNum5() { return keys[11]; }
	public boolean getNum6() { return keys[12]; }
	public boolean getNum7() { return keys[13]; }
	public boolean getNum8() { return keys[14]; }
	public boolean getNum9() { return keys[15]; }
	public boolean getEnter() { return keys[16]; }
	
	public boolean setSpace(boolean is) { return keys[0] = is; }
	public boolean setW(boolean is) { return keys[1] = is; }
	public boolean setA(boolean is) { return keys[2] = is;	}
	public boolean setS(boolean is) { return keys[3] = is; }
	public boolean setD(boolean is) { return keys[4] = is; }
	public boolean setShift(boolean is) { return keys[5] = is; }
	public boolean setNum0(boolean is) { return keys[6] = is; }
	public boolean setNum1(boolean is) { return keys[7] = is; }
	public boolean setNum2(boolean is) { return keys[8] = is; }
	public boolean setNum3(boolean is) { return keys[9] = is; }
	public boolean setNum4(boolean is) { return keys[10] = is; }
	public boolean setNum5(boolean is) { return keys[11] = is; }
	public boolean setNum6(boolean is) { return keys[12] = is; }
	public boolean setNum7(boolean is) { return keys[13] = is; }
	public boolean setNum8(boolean is) { return keys[14] = is; }
	public boolean setNum9(boolean is) { return keys[15] = is; }
	public boolean setEnter(boolean is) { return keys[16] = is; }
	
	public class KA extends KeyAdapter {
		
		public void keyPressed(KeyEvent ke) {
			
			int key = ke.getKeyCode();
			switch (key) {
			
			case KeyEvent.VK_SPACE: setSpace(true);
			case KeyEvent.VK_W: setW(true);
			case KeyEvent.VK_A: setA(true);
			case KeyEvent.VK_S: setS(true);
			case KeyEvent.VK_D: setD(true);
			case KeyEvent.VK_SHIFT: setShift(true);
			
			case KeyEvent.VK_NUMPAD0: setNum0(true);
			case KeyEvent.VK_NUMPAD1: setNum1(true);
			case KeyEvent.VK_NUMPAD2: setNum2(true);
			case KeyEvent.VK_NUMPAD3: setNum3(true);
			case KeyEvent.VK_NUMPAD4: setNum4(true);
			case KeyEvent.VK_NUMPAD5: setNum5(true);
			case KeyEvent.VK_NUMPAD6: setNum6(true);
			case KeyEvent.VK_NUMPAD7: setNum7(true);
			case KeyEvent.VK_NUMPAD8: setNum8(true);
			case KeyEvent.VK_NUMPAD9: setNum9(true);
			
			case KeyEvent.VK_ENTER: setEnter(true);
			
			}
			
		}
		
		public void keyReleased(KeyEvent ke) {
			
			int key = ke.getKeyCode();
			switch (key) {
			
			case KeyEvent.VK_SPACE: setSpace(false);
			case KeyEvent.VK_W: setW(false);
			case KeyEvent.VK_A: setA(false);
			case KeyEvent.VK_S: setS(false);
			case KeyEvent.VK_D: setD(false);
			case KeyEvent.VK_SHIFT: setShift(false);
			
			case KeyEvent.VK_NUMPAD0: setNum0(false);
			case KeyEvent.VK_NUMPAD1: setNum1(false);
			case KeyEvent.VK_NUMPAD2: setNum2(false);
			case KeyEvent.VK_NUMPAD3: setNum3(false);
			case KeyEvent.VK_NUMPAD4: setNum4(false);
			case KeyEvent.VK_NUMPAD5: setNum5(false);
			case KeyEvent.VK_NUMPAD6: setNum6(false);
			case KeyEvent.VK_NUMPAD7: setNum7(false);
			case KeyEvent.VK_NUMPAD8: setNum8(false);
			case KeyEvent.VK_NUMPAD9: setNum9(false);
			
			case KeyEvent.VK_ENTER: setEnter(false);
			
			}
			
		}
		
	}

}
