package org.qa.menu;

import org.qa.utils.UserInput;

public enum TableOptions {
	CAR("Make changes to the Car table"),
	MOTORBIKE("Make changes to the Motorbike table"),
	TRUCK("Make changes to the Truck table"),
	EXIT("Exit the program");
	
	private String description;
	
	TableOptions(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.name() + " " + description;
	}
	
	public static void printActions() {
		for(TableOptions options: TableOptions.values()) {
			System.out.println(options.getDescription());
		}
	}
	
	public static TableOptions pickOption(UserInput input) {
		TableOptions option;
		while(true) {
			try {
				System.out.println("Please make a selection");
				String choice = input.getString();
				option = TableOptions.valueOf(choice.toUpperCase());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid selection");
			}
		}
		return option;
	}
	
}
