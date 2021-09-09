package org.qa.controllers;

import java.util.List;

import org.qa.automotives.Vehicle;

public interface Controller<T extends Vehicle> {
	
	T create();
	
	int delete();
	
	List<T> readAll();
	
	T readByID();
	
	T update();
}
