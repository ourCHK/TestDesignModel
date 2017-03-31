package chapter1.myDuck;

import chapter1.myimplements.FlyWithWings;
import chapter1.myimplements.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehavior = new FlyWithWings();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am MallardDuck");
	}

}
