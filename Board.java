package edu.cpp.cs.cs141.final_prog_assignment;
import java.util.Random;

public class Board {
	private final int horizontal = 9;
	private final int vertical = 9;
	private Square[][] board = new Square[vertical][horizontal];
	private Random random = new Random();
	private int[] briefcaseX = {1,4,7};
	private int[] briefcaseY = {1,4,7};
	
	Board() {
		createBoard();
	}

	public void createBoard() {
		int i = briefcaseX[random.nextInt(3)];
		int j = briefcaseY[random.nextInt(3)];

		for(int x=0;x<horizontal;x++) {
			for(int y=0;y<vertical;y++) {
				if((y==1 || y==4 || y==7) && (x==1 || x==4 || x==7)) {
					if(x == i && y == j)
						board[x][y] = new Room("briefcase", x, y);
					else
						board[x][y] = new Room(x, y);
				}
				else
					board[x][y] = new Square();
			}
		}
	}

	public String displayBoard(int x, int y) {
			return board[x][y].display();	
	}	
	
	public Square at(int x, int y) {
		return board[x][y];
	}

	public void set(Player player, int x, int y) {
		board[x][y] = player;
		player.setX(x);
		player.setY(y);
		
	}

	public void set(Ninja ninja, int x, int y) {
		board[x][y] = ninja;	
	}

	public void set(PowerUp radar, int x, int y) {
		board[x][y] = radar;
		
	}

	public boolean checkX(int i, int x, int y) {
		boolean clear = true;
		try {
			board[x+i][y].setRevealed(true);
			if(board[x+i][y].getNinja()) {
				clear = false;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			//do nothing
		}catch(NullPointerException e) {
			//do nothing
		}
		return clear;
	}

	public boolean checkY(int i, int x, int y) {
		boolean clear = true;
		try {
			board[x][y+i].setRevealed(true);
			if(board[x][y+i].getNinja()) {
				clear = false;
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			//do nothing
		}catch(NullPointerException e) {
			//do nothing
		}
		return clear;
	}
	
}
