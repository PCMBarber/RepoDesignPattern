package org.qa.menu;
import org.qa.utils.UserInput;

public enum MenuOptions {
	CREATE("Create a Vehicle to put in the garage"), 
	READALL("Read a Vehicle from the garage"),
	READBYID("Read a single by their ID"),
	UPDATE("Update a Vehicle from the garage"),
	DELETE("Delete a Vehicle from the garage"), 
	EXIT("Exits the program");
	
	private String description;
	
	MenuOptions(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return this.name() + " " + description;
	}
	
	public static void printActions() {
		for(MenuOptions options: MenuOptions.values()) {
			System.out.println(options.getDescription());
		}
	}
	
	public static MenuOptions pickOption(UserInput input) {
		MenuOptions option;
		while(true) {
			try {
				System.out.println("Please make a selection");
				String choice = input.getString();
				option = MenuOptions.valueOf(choice.toUpperCase());
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid selection");
			}
		}
		return option;
	}
}














