package org.qa.menu;
import org.qa.utils.UserInput;

public enum menuOptions {
	CREATE("Create a Vehicle to put in the garage"), 
	READ("Read a Vehicle from the garage"), 
	DELETE("Delete a Vehicle from the garage"), 
	EXIT("Exits the program");
	
	private String description;
	
	menuOptions(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.name() + " " + description;
	}
	
	public static void printActions() {
		for(menuOptions options: menuOptions.values()) {
			System.out.println(options.getDescription());
		}
	}
	
	public static menuOptions pickOption(UserInput input) {
		menuOptions option;
		while(true) {
			try {
				System.out.println("Please make a selection");
				String choice = input.getString();
				option = menuOptions.valueOf(choice.toUpperCase());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid selection");
			}
		}
		return option;
	}
}














