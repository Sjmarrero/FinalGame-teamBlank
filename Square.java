package edu.cpp.cs.cs141.final_prog_assignment;

public class Square{
	
	private boolean isPlayer;
	private boolean isNinja;
	private boolean isRoom;
	private boolean isPowerUp;
	private boolean covered;
	
	public Square() {
		isPlayer = false;
		isNinja = false;
		isRoom = false;
		isPowerUp = false;
	}
	
	public void setPlayer() {
		isPlayer = true;
	}

	public void setNinja() {
		isNinja = true;
	}
	
	public void setRoom() {
		isRoom = true;
	}
	
	public void setPowerUp() {
		isPowerUp = true;
	}
	
	public boolean getPlayer() {
		return isPlayer;
	}
	
	public boolean getNinaja() {
		return isNinja;
	}
	
	public boolean getRoom() {
		return isRoom;
	}
	
	public boolean getPowerUp() {
		return isPowerUp;
	}
	
	public String display() {
		return " ! ";
	}

	public void setCovered(boolean b) {
		covered = b;
	}
	
	public boolean getCovered() {
		return covered;
	}
}
