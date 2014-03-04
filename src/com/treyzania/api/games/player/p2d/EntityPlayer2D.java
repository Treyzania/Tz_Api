package com.treyzania.api.games.player.p2d;

import com.treyzania.api.games.games2d.Entity2D;
import com.treyzania.api.games.games2d.models.Model;
import com.treyzania.api.games.player.IPlayer;

public abstract class EntityPlayer2D extends Entity2D implements IPlayer {

	public int health;
	public int maxHealth;
	public int mana;
	public int maxMana;
	public int stamina;
	public int maxStamina;
	
	public String playerName;
	
	public EntityPlayer2D(Model model, String playerName) {
		
		super("player", model);
		
		this.playerName = playerName;
		
	}

}
