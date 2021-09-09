package org.qa.automotives;

public class Car extends Vehicle {

	private int wheels;
	private int doors;

	public Car(int ID, String maker, String colour, int wheels, int doors) {
		super(ID, "Car", maker, colour);
		this.wheels = wheels;
		this.doors = doors;
	}
	
	public Car(String maker, String colour, int wheels, int doors) {
		super("Car", maker, colour);
		this.wheels = wheels;
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public double calculateCost() {
		return 150;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (doors != other.doors)
			return false;
		if (wheels != other.wheels)
			return false;
		return true;
	}

}