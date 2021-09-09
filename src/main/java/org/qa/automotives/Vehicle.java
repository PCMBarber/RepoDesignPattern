package org.qa.automotives;

public abstract class Vehicle {
	
	private int ID;
	private String type;
	
	private String maker;
	private String colour;
	
	public Vehicle(int ID, String type, String maker, String colour) {
		super();
		this.ID = ID;
		this.type = type;
		this.maker = maker;
		this.colour = colour;
	}
	
	public Vehicle(String type, String maker, String colour) {
		super();
		this.ID = 0;
		this.type = type;
		this.maker = maker;
		this.colour = colour;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	

	@Override
	public String toString() {
		return "Vehicle [ID=" + ID + ", type=" + type + ", maker=" + maker + ", colour=" + colour + "]";
	}

	public abstract double calculateCost();
	
}