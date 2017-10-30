package edu.coo.cs.cs141.final_prog_assignment;

public class PowerUp {
	
	private enum powerType{ RADAR, INVINCIBLE, AMMO};

	private powerType type;
	private int X;
	private int Y;
	
	PowerUp(String S){
		
		switch(S)
		{
		case "radar":
			type = powerType.RADAR;
			break;
			
		case "invincible":
			type = powerType.INVINCIBLE;
			break;
			
		case "ammo":
			type = powerType.AMMO;
			break;
			default:
				System.out.print("Error: PowerUp - switch");
		}
	}
	
}
