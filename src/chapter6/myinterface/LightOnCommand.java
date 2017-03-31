package chapter6.myinterface;

import chapter6.item.Light;

public class LightOnCommand implements Command{

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.off();
	}
	
	

}
