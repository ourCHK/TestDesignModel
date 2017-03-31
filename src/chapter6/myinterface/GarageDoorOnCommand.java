package chapter6.myinterface;

import chapter6.item.GarageDoor;

public class GarageDoorOnCommand implements Command{

	GarageDoor garageDoor;
	
	public GarageDoorOnCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garageDoor.up();
	}
	
	@Override
	public void undo() {
		garageDoor.down();
	}
	
}
