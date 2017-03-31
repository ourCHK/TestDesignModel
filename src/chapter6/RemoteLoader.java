package chapter6;

import chapter6.item.CeilingFan;
import chapter6.item.KitchenLight;
import chapter6.item.LivingRoomLight;
import chapter6.myinterface.CeilingFanOffCommand;
import chapter6.myinterface.CeilingFanOnCommand;
import chapter6.myinterface.Command;
import chapter6.myinterface.HighSpeedCeilingFanCommand;
import chapter6.myinterface.LightOffCommand;
import chapter6.myinterface.LightOnCommand;
import chapter6.myinterface.LowSpeedCeilingFanCommand;
import chapter6.myinterface.MacroOffCommand;
import chapter6.myinterface.MacroOnCommand;
import chapter6.myinterface.MediumSpeedCeilingFanCommand;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		
		LivingRoomLight livingRoomLight = new LivingRoomLight();
		LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);
		control.setCommand(0, lightOnCommand, lightOffCommand);
		
		CeilingFan fan = new CeilingFan();
		CeilingFanOnCommand fanOnCommand = new CeilingFanOnCommand(fan);
		CeilingFanOffCommand fanOffCommand = new CeilingFanOffCommand(fan);
		control.setCommand(2, fanOnCommand, fanOffCommand);
		
		HighSpeedCeilingFanCommand highSpeedFanCommand = new HighSpeedCeilingFanCommand(fan);
		MediumSpeedCeilingFanCommand mediumSpeedFanCommand = new MediumSpeedCeilingFanCommand(fan);
		LowSpeedCeilingFanCommand lowSpeedCeilingFanCommand = new LowSpeedCeilingFanCommand(fan);
		
		control.setCommand(3, highSpeedFanCommand, fanOffCommand);
		control.setCommand(4, mediumSpeedFanCommand, fanOffCommand);
		control.setCommand(5, lowSpeedCeilingFanCommand, fanOffCommand);
//		
//		control.onButtonWasPressed(2);
//		control.onButtonWasPressed(3);
//		control.offButtonWasPressed(3);
//		control.undo();
//		control.onButtonWasPressed(5);
//		control.undo();
		
		KitchenLight kitLight = new KitchenLight();
		LightOnCommand macroLightOnCommand = new LightOnCommand(kitLight);
		LightOffCommand macroLightOffCommand = new LightOffCommand(kitLight);
		CeilingFan macroFan = new CeilingFan();
		CeilingFanOnCommand macroFanOnCommand = new CeilingFanOnCommand(macroFan);
		CeilingFanOffCommand macroFanOffCommand = new CeilingFanOffCommand(macroFan);
		LowSpeedCeilingFanCommand macroLowSpeedFanOnCommand = new LowSpeedCeilingFanCommand(macroFan);
		HighSpeedCeilingFanCommand macroHighSpeedFanOnCommand = new HighSpeedCeilingFanCommand(macroFan);
		
		
		Command[] onCommands = {macroLightOnCommand,macroFanOnCommand,macroHighSpeedFanOnCommand,macroLowSpeedFanOnCommand};
		Command[] offCommands = {macroLightOffCommand,macroFanOffCommand,macroFanOffCommand,macroFanOffCommand};
		MacroOnCommand macroOnCommand = new MacroOnCommand(onCommands);
		MacroOffCommand macroOffCommand = new MacroOffCommand(offCommands);
		control.setCommand(6, macroOnCommand, macroOffCommand);
		
		control.onButtonWasPressed(6);
		control.onButtonWasPressed(0);
		control.undo();
		
		
	}
}
