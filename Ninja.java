package edu.cpp.cs.cs141.final_prog_assignment;

public class Ninja extends Square{
	
	private boolean life;
	
	public Ninja() {
		super();
		super.setNinja();
		life = true;
	}
	
	public void die() {
		life = false;
	}
	
	public boolean isAlive() {
		return life;
	}
	
	public String display() {
		if(getRevealed())
			return " N ";
		else
			return " * ";
	}

}
