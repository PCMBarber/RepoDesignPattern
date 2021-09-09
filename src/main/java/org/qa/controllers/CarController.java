package org.qa.controllers;

import java.util.List;

import org.qa.automotives.Car;
import org.qa.dao.CarDAO;
import org.qa.utils.UserInput;

public class CarController implements Controller<Car> {
	
	private UserInput input = UserInput.getInstance();
	
	CarDAO dao = new CarDAO();
	
	@Override
	public Car create() {
		System.out.println("What is the maker of the car?");
		String maker = input.getString();
		System.out.println("What is the colour?");
		String colour = input.getString();
		System.out.println("How many wheels?");
		int wheels= input.getInt();
		System.out.println("How many doors?");
		int doors= input.getInt();
		return dao.create(new Car(maker, colour, wheels, doors));
	}

	@Override
	public int delete() {
		for(Car car: dao.readAll()) {
			System.out.println(car);
		}
		System.out.println("ID of car to delete?");
		int id = input.getInt();
		return dao.delete(id);
	}

	@Override
	public List<Car> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car readByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car update() {
		// TODO Auto-generated method stub
		return null;
	}

}
