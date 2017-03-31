package chapter1.myimplements;

import chapter1.myInterface.QuackBehavior;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("MuteQuack");
	}
	

}
