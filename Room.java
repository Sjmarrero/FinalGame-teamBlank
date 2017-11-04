package edu.cpp.cs.cs141.final_prog_assignment;

public class Room extends Square {

	private boolean briefcase;
	private int x;
	private int y;
	
	public Room(int i, int j){
		super();
		super.setRoom();
		x = i;
		y = j;
	}
	
	public Room(String string, int i , int j) {
		super();
		super.setRoom();
		briefcase = true;
		x = i;
		y = j;
	}

	public String display() {
		return "[_]";
	}
	
	public boolean hasBriefcase() {
		return briefcase;
	}
}
