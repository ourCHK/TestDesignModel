package chapter6.myinterface;

public class MacroOnCommand implements Command{

	Command[] commands;
	
	public MacroOnCommand(Command[] commands) {
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(int i=0; i<commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(int i=0; i<commands.length; i++) {
			commands[i].undo();
		}
	}
	
}
