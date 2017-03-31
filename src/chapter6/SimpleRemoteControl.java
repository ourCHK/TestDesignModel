package chapter6;

import chapter6.myinterface.Command;

public class SimpleRemoteControl {
	Command slop;
	
	public SimpleRemoteControl() {
		
	}
	
	public void setCommand(Command command) {
		slop = command;
	}
	
	public void buttonWasPressed() {
		slop.execute();
	}
	
	
	
	
	
}
