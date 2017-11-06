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
			if(s.getEmpty() || s.getPowerUp()) {
				if(s.getEmpty())
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
			if((board.at(x,y)).getEmpty()) {
				radar = new PowerUp("radar", x, y );
				board.set(radar, x, y);
			}
		}
		while(invincible == null) {
			x = getRandom();
			y = getRandom();
			if((board.at(x,y)).getEmpty()) {
				invincible = new PowerUp("invincible", x, y);
				board.set(invincible, x, y);
			}
		}
		while(ammo == null) {
			x = getRandom();
			y = getRandom();
			if((board.at(x,y)).getEmpty()) {
				ammo = new PowerUp("ammo", x, y);
				board.set(ammo, x, y);
			}
		}	
	}

	public int getRandom(){
		return random.nextInt(9);
	}
	
	public String displayBoard(int x, int y){
		return board.displayBoard(x, y);
	}


	public String look(String direction) {
		boolean clear = true;
		switch(direction.toLowerCase()) {
		case "w":
			if(board.checkX(-1,player.getX(), player.getY()) == false) {
				clear = false;
				break;
			}
			else if(board.checkX(-2, player.getX(), player.getY()) == false) {
				clear = false;
				break;
			}
			break;
		case "a":
			if(board.checkY(-1,player.getX(), player.getY()) == false) {
				clear = false;
				break;
			}
			else if(board.checkY(-2, player.getX(), player.getY()) == false) {
				clear = false;
				break;
			}
			break;
		case "s":
			if(board.checkX(1,player.getX(), player.getY()) == false) {
				clear = false;
				break;
			}
			else if(board.checkX(2, player.getX(), player.getY()) == false) {
				clear = false;
				break;
			}
			break;
		case "d":
			if(board.checkY(1,player.getX(), player.getY()) == false) {
				clear = false;
				break;
			}
			else if(board.checkY(2, player.getX(), player.getY()) == false) {
				clear = false;
				break;
			}
			break;
			default:
				System.out.print("Error: GameEngine-look-switch");
		}
		if(clear)
			return "All Clear!";
		else
			return "Ninja Ahead!";	
	}


	public void move(String direction) {
		
	}
	
	public void shoot(String direction) {
		int value = 0;
		if(direction.equals("w") || direction.equals("s"))
			value = 1;
		else
			value = -1;
		int x = player.getX();
		int y = player.getY();
		switch(direction) {
		case "w":
		case "d":
			for(int i = x + value; i > 0 && i < 9; i+=value) {
				if(board.at(i, y).getNinja()) {
					killNinja(i, y);
					break;
				}
			}
			break;
		case "a":
		case "s":
			for(int j = y + value; j > 0 && j < 9; j+=value) {
				if(board.at(x, j).getNinja()) {
					killNinja(x, j);
					break;
				}
			}
			break;
			default:
				System.out.println("Error: GameEninge-shoot-switch");
		}
	}


	private void killNinja(int x, int y) {
		for(int i = 0; i < ninjas.length; i++)
		{
			if(ninjas[i].getX() == x && ninjas[i].getY() == y)
				ninjas[i].die();
		}
		
	}


	public void resetRevealed() {
		
	}
}



