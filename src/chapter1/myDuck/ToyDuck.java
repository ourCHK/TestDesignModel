package chapter1.myDuck;

import chapter1.myimplements.FlyNoWay;
import chapter1.myimplements.MuteQuack;

public class ToyDuck extends Duck {

	public ToyDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new MuteQuack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a ToyDuck！");
	}

}
