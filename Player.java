package edu.cpp.cs.cs141.final_prog_assignment;

public class Player extends Square{
	
	private int lives = 3;
	private boolean briefcase = false;
	
	public Player() {
		super();
		super.setPlayer();
	}
	
	public String display() {
		return " P ";
	}
	
	public void decLives() {
		if(lives > 0)
			lives--;
	}
	
	public boolean isAlive() {
		if(lives <= 0)
			return false;
		else 
			return true;
	}
	
	public void setBriefcase() {
		briefcase = true;
	}
	
	public boolean hasBriefcase() {
		return briefcase;
	}

}
