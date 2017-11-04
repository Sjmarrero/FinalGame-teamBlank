package edu.cpp.cs.cs141.final_prog_assignment;

import java.util.Random;

public class GameEngine {
	
	private Random random = new Random();
	
	private Player player;
	private Board board;
	private Ninja[] ninjas = new Ninja[6];
	private PowerUp radar = null;
	private PowerUp invincible = null;
	private PowerUp ammo = null;
	
	
	public void createBoard() {
		player = new Player();
		board = new Board();
		board.set(player, 8, 0);
		createPowerUp();	
		createNinjas();
	}
	
	
	private void createNinjas() {
		for(int i = 0; i < 6; i++) {
			ninjas[i] = new Ninja();
			setNinja(ninjas[i]);
			}
		}
		
	private void setNinja(Ninja ninja) {
		int x, y;
		boolean set = false;
		do {
			x = random.nextInt(9);
			if(x > 4)
				y = random.nextInt(5) + 4;
			else
				y = random.nextInt(9);
			
			Square s = board.at(x, y);
			if(s == null || s.getPowerUp()) {
				if(s == null)
					board.set(ninja, x, y);
				else {
					s.setCovered(true);
					board.set(ninja, x, y);
				}
				set = true;
			}
		}while(set == false);

	}


	private void createPowerUp() {
		int x, y;
		while(radar == null) {
			x = getRandom();
			y = getRandom();
			if(board.at(x, y) == null) {
				radar = new PowerUp("radar", x, y );
				board.set(radar, x, y);
			}
		}
		while(invincible == null) {
			x = getRandom();
			y = getRandom();
			if(board.at(x,y) == null) {
				invincible = new PowerUp("invincible", x, y);
				board.set(invincible, x, y);
			}
		}
		while(ammo == null) {
			x = getRandom();
			y = getRandom();
			if(board.at(x,y) == null) {
				ammo = new PowerUp("ammo", x, y);
				board.set(ammo, x, y);
			}
		}	
	}

	public int getRandom(){
		return random.nextInt(9);
	}
	
	public void displayBoard(){
		board.displayBoard();
	}
}



