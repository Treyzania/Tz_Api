package com.treyzania.dev_workshop;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import com.treyzania.api.games.Point2F;
import com.treyzania.api.games.games3d.render.RenderingTexture;
import com.treyzania.api.games.games3d.render.shapes.ROTexturedQuad;
import com.treyzania.api.games.games3d.render.textures.GGAlpha;
import com.treyzania.api.games.games3d.render.textures.MappedQuad;
import com.treyzania.api.games.games3d.render.textures.Quad;
import com.treyzania.api.games.games3d.render.textures.TMAlpha;

public class TweakPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private BufferedImage kittens;
	
	public TweakPanel() {
		
		String kittiesUrl = "http://placekitten.com/g/32/32";
		
		try {
			kittens = ImageIO.read(new URL(kittiesUrl));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void paint(Graphics g) {		
		
		super.paint(g);
		
		RenderingTexture rt = new RenderingTexture(kittens);
		
		Point2F a = new Point2F(16, 16);
		Point2F b = new Point2F(128 + 16, 16);
		Point2F c = new Point2F(16, 128 + 16);
		Point2F d = new Point2F(128 + 16, 128 + 16);
		
		MappedQuad mq = new MappedQuad(new Quad(a, b, c, d), rt);
		mq.gridify(new GGAlpha());
		mq.texMapping(new TMAlpha());
		
		ROTexturedQuad rotq = new ROTexturedQuad(mq);
		
		rotq.render(g);
		
	}
	
	
}
