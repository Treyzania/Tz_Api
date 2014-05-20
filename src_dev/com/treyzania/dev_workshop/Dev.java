package com.treyzania.dev_workshop;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.treyzania.api.TzAPI;

public class Dev {

	static {
		TzAPI.initalize();
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		
		frame.setSize(1280, 720);
		frame.setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setResizable(true);
		frame.setFocusable(true);
		
		JPanel jp = new TweakPanel();
		frame.add(jp);
		
		jp.setVisible(true);
		frame.setVisible(true);
		
		while (true) {
			
			jp.repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		/*
		 * TreeDataFile tdf = new TreeDataFile("dev_output\\newData.tdf",
		 * false);
		 * 
		 * tdf.flush();
		 * 
		 * EntryCompound lastEc = tdf.getRD(); lastEc = lastEc.setCompound("q");
		 * lastEc = lastEc.setCompound("w"); lastEc = lastEc.setCompound("e");
		 * lastEc = lastEc.setCompound("r"); lastEc = lastEc.setCompound("t");
		 * lastEc = lastEc.setCompound("y"); lastEc.setInteger("h", 1);
		 * 
		 * Entry foundEntry =
		 * tdf.getRD().getECompound("q").getECompound("w").getECompound
		 * ("e").getECompound
		 * ("r").getECompound("t").getECompound("y").getEntry("h");
		 * System.out.println(foundEntry);
		 * System.out.println(TzAPI.getAPIVersion());
		 */

		// Plotter p = new PlotterProjectionPerspective_Alpha(null, 0);

	}

}
