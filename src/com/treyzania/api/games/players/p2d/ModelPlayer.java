package com.treyzania.api.games.players.p2d;

import java.awt.Graphics2D;
import java.util.ArrayList;

import com.treyzania.api.games.games2d.Entity2D;
import com.treyzania.api.games.games2d.Model;

public class ModelPlayer extends Model {

	public ArrayList<Bodypart2D> bodyparts;
	
	// TODO Switch this to an EntityPlayer.
	public ModelPlayer(Entity2D ep) {
		
		super(ep);
		
		bodyparts = new ArrayList<Bodypart2D>();
		
	}

	@Override
	public void render(Graphics2D g2d) {
		
		for (Bodypart2D part : bodyparts) {
			
			part.render(g2d, boundEntity);
			
		}
		
	}
	
}
