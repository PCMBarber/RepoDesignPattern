package org.qa;

import java.util.List;

import org.qa.automotives.Car;
import org.qa.controllers.CarController;
import org.qa.dao.CarDAO;

public class Runner {
	public static void main(String[] args) {
		CarController cont = new CarController();
		System.out.println(cont.create());
	}
}
