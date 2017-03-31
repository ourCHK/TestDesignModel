package chapter1.myimplements;

import chapter1.myInterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I can't not fly!");
	}

}
