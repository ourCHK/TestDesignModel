package chapter6.myinterface;

import chapter6.item.Stereo;

public class StereoOnWithCDCommand implements Command{
	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
	}
	
	public void undo() {
		stereo.off();
	}
	

	
}
