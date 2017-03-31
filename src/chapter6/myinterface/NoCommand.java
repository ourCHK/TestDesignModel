package chapter6.myinterface;

public class NoCommand implements Command{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("this is no command");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("this is no undo command");
	}

}
