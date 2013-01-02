package com.treyzania.api.games.gfx2d;

import java.awt.Graphics2D;

import com.treyzania.api.games.Entity2D;
import com.treyzania.api.games.IPhysicsPlayer;

public class PlayerModel extends Model {

	public PlayerModel(IPhysicsPlayer player) {
		
		super((Entity2D) player);
		
	}

	@Override
	public void render(Graphics2D g2d) {
		
		
	}

}
