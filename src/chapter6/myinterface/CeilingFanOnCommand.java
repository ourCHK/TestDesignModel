package chapter6.myinterface;

import chapter6.item.CeilingFan;

public class CeilingFanOnCommand implements Command{

	CeilingFan ceilingFan;
	int preSpeed;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		preSpeed = ceilingFan.getSpeed();
		ceilingFan.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		switch(preSpeed) {
		case CeilingFan.HIGH:
			ceilingFan.high();
			break;
		case CeilingFan.MEDIUM:
			ceilingFan.medium();
			break;
		case CeilingFan.LOW:
			ceilingFan.low();
			break;
		case CeilingFan.OFF:
			ceilingFan.off();
			break;
		}
	}

}
