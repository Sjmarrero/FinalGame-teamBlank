package edu.cpp.cs.cs141.final_prog_assignment;

public class PowerUp extends Square{
	
	private String type;
	private int x;
	private int y;
	
	public PowerUp(String s, int i, int j) {
		super();
		super.setPowerUp();
		type = s;
	}
	
	public String display() {
		if(getRevealed()) {
			switch(type) {
			case "radar":
				return " r ";
			case "invincible":
				return " i ";
			case "ammo":
				return " a ";
				default:
					return "Error - PowerUp.display - Switch";
			}
		}
		else
			return " * ";
	}
	
	public String name() {
		return type;
	}

}
