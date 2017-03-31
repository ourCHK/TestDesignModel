package chapter6.item;

public class CeilingFan {
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	int speed;
	String location;
	
	public void high() {
		speed = HIGH;
		System.out.println("the fan's current speed is high");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println("the fan's current speed is medium");
	}
	
	public void low() {
		speed = LOW;
		System.out.println("the fan's current speed is low");
	}
	
	public void on() {
		System.out.println("Ceiling fan is on,the current speed is " + speed );
	}
	
	public void off() {
		speed = OFF;
		System.out.println("Ceiling fan is off");
	}
	
	public int getSpeed() {
		return speed;
	}
}
