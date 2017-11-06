package edu.cpp.cs.cs141.final_prog_assignment;

public class Square{
	
	private boolean isEmpty;
	private boolean isPlayer;
	private boolean isNinja;
	private boolean isRoom;
	private boolean isPowerUp;
	private boolean covered = false;
	private boolean revealed = false;
	private int x, y;
	
	public Square() {
		isEmpty = true;
		isPlayer = false;
		isNinja = false;
		isRoom = false;
		isPowerUp = false;
	}
	
	public void setPlayer() {
		isPlayer = true;
		isEmpty = false;
	}

	public void setNinja() {
		isNinja = true;
		isEmpty = false;
	}
	
	public void setRoom() {
		isRoom = true;
		isEmpty = false;
	}
	
	public void setPowerUp() {
		isPowerUp = true;
		isEmpty = false;
	}
	
	public boolean getEmpty() {
		return isEmpty;
	}
	
	public boolean getPlayer() {
		return isPlayer;
	}
	
	public boolean getNinja() {
		return isNinja;
	}
	
	public boolean getRoom() {
		return isRoom;
	}
	
	public boolean getPowerUp() {
		return isPowerUp;
	}
	
	public String display() {
		if(revealed)
			return "   ";
		else
			return " * ";
	}

	public void setCovered(boolean b) {
		covered = b;
	}
	
	public boolean getCovered() {
		return covered;
	}
	
	public void setRevealed(boolean b) {
		revealed = b;
	}
	
	public boolean getRevealed() {
		return revealed;
	}
	
	public void setX(int i) {
		x = i;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int j) {
		y = j;
	}
	
	public int getY() {
		return y;
	}
}
