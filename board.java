package edu.coo.cs.cs141.final_prog_assignment;
import java.util.Random;

public class board {
	final int horizontal = 9;
	final int vertical = 9;
	String[][] Board = new String [horizontal][vertical];
	private int depth;
	private Random rand = new Random();
	private PowerUp radar = null;
	private PowerUp invincible = null;
	private PowerUp ammo = null;
	
	board() {
		createBoard();
	}
	
	public void createBoard() {
		for(int x=0;x<horizontal;x++) {
			for(int y=0;y<vertical;y++) {
				if((y==1 || y==4 || y==7) && (x==1 || x==4 || x==7)) {
					Board[x][y] = "?";
				}
				else 
					Board[x][y] = "O";
			}
		}
		createPowerUp();
	}
	
	private void createPowerUp() {
		int x, y;
		while(radar == null) {
			x = getRandom();
			y = getRandom();
			if(Board[x][y] != "O") {}
			else {
				radar = new PowerUp("radar", x, y);
				Board[x][y] = "r";
			}
		}
		while(invincible == null) {
			x = getRandom();
			y = getRandom();
			if(Board[x][y] != "O") {}
			else {
				invincible = new PowerUp("invincible", x, y);
				Board[x][y] = "i";
			}
		}
		while(ammo == null) {
			x = getRandom();
			y = getRandom();
			if(Board[x][y] != "O") {}
			else {
				ammo = new PowerUp("ammo", x, y);
				Board[x][y] = "a";
			}
		}	
	}

	private int getRandom() {
		return rand.nextInt(9);
	}
	
	
	public void overWrite(int x, int y) {
		createBoard();
		Board[x][y] = "P";
	}
	
	public void displayBoard() {
		for(int x=0;x<horizontal;x++) {
			System.out.println("");
			for(int y=0;y<vertical;y++) {
				System.out.print(Board[x][y] + " ");
			}
		}
	System.out.println("\n");		
	}
}
