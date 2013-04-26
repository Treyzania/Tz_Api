package com.treyzania.api.games.content.player;

import java.util.Random;

public class Player {

	public final long uid;
	public final long id_a;
	public final long id_b;
	
	public final long creationTime;
	public String username;
	
	AchievementStorage achievements;
	StatisticsStorage stats;
	
	public Player(String username) {
		
		// Security (I hope that this works...)
		Random rand = new Random();
		this.id_a = rand.nextInt(2 ^ 16);
		this.id_b = rand.nextInt(2 ^ 8);
		this.uid = (rand.nextInt(32) * this.id_a) ^ this.id_b;
		
		// Actual personalization
		this.creationTime = System.currentTimeMillis();
		this.username = username;
		
	}
	
	// TODO Add more player data.
	
}
