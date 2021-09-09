package org.qa.garage;

import java.util.ArrayList;

import org.qa.automotives.Vehicle;

public class Garage {

	private ArrayList<Vehicle> garage = new ArrayList<Vehicle>();

	private static Garage instance = null;

	private Garage() {

	}

	public static Garage getInstance() {
		if (instance == null) {
			instance = new Garage();
		}
		return instance;
	}

	public void addVehicle(Vehicle vehicle) {
		garage.add(vehicle);
	}

	public void removeByID(int id) {
		Vehicle found = null;
		for (Vehicle vehicle : garage) {
			if (vehicle.getID() == id) {
				found = vehicle;
			}
		}
		garage.remove(found);
	}

	public void removeByType(String type) {
		ArrayList<Vehicle> found = new ArrayList<Vehicle>();
		for (Vehicle vehicle : garage) {
			if (vehicle.getType() == type) {
				found.add(vehicle);
			}
		}
		for(Vehicle destroy: found) {
			garage.remove(destroy);
		}
	}

	public double calculateCostByID(int id) {
		for (Vehicle vehicle : garage) {
			if (vehicle.getID() == id) {
				double yeet = vehicle.calculateCost();
				return yeet;
			}
		}
		return 0;
	}

	public void fixVehicleByID(int id) {
		for (Vehicle vehicle : garage) {
			if (vehicle.getID() == id) {
				System.out.println("This " + vehicle.getType() + " was repaired for £" + vehicle.calculateCost());
			}
		}
		removeByID(id);
	}

	public void printGarage() {
		for (Vehicle vehicle : garage) {
			System.out.println(vehicle);
		}
	}

	public void empty() {
		garage.clear();
	}

	public ArrayList<Vehicle> getGarage() {
		return garage;
	}
}