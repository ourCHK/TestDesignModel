package chapter1.myDuck;

import chapter1.myimplements.FlyNoWay;
import chapter1.myimplements.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am model duck");
	}

}
