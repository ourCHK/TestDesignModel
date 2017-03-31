package chapter6;

import chapter6.myinterface.Command;
import chapter6.myinterface.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		for(int i=0; i<7; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
		undoCommand = new NoCommand();
		
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undo() {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n ----- Remote Control ------\n");
		for(int i=0; i<onCommands.length; i++) {
			stringBuffer.append("[slot" + i + "]" + onCommands[i].getClass().getName()+"   " + offCommands[i].getClass().getName() + "\n");
		
		}
		return stringBuffer.toString();
	}
	
}
