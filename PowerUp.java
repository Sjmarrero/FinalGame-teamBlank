package edu.cpp.cs.cs141.final_prog_assignment;

public class PowerUp extends Square{
	
	private String type;
	private int x;
	private int y;
	private boolean covered = false;
	
	public PowerUp(String s, int i, int j) {
		super();
		super.setPowerUp();
		type = s;
	}
	
	public String display() {
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
	
	public String name() {
		return type;
	}

}
