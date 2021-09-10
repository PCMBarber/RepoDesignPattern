package org.qa.menu;

import org.qa.controllers.CarController;
import org.qa.controllers.Controller;
import org.qa.utils.UserInput;

public class Menu {
	
	private Controller<?> active;
	
	private CarController carCont;
	private UserInput input;
	
	public Menu() {
		this.carCont = new CarController();
		this.input = new UserInput();
	}
	
	
	public void menuStart() {
		TableOptions.printActions();
		TableOptions choice = TableOptions.pickOption(input);
		switch(choice) {
		case CAR:
			active = this.carCont;
			break;
		case MOTORBIKE:
			System.out.println("Not yet implemented");
			break;
		case TRUCK:
			System.out.println("Not yet implemented");
			break;
		case EXIT:
			System.exit(1);
		default:
			menuStart();
		}
		
		MenuOptions.printActions();
		MenuOptions actionChoice = MenuOptions.pickOption(input);
		switch(actionChoice) {
		case CREATE:
			active.create();
			break;
		case READALL:
			active.readAll();
			break;
		case READBYID:
			active.readByID();
			break;
		case UPDATE:
			active.update();
			break;
		case DELETE:
			active.delete();
			break;
		case EXIT:
			menuStart();
			break;
		default:
			menuStart();
		}
	}
}
