package chapter1.myDuck;

import chapter1.myInterface.FlyBehavior;
import chapter1.myInterface.QuackBehavior;

/**
 * 鸭子抽象类
 * @author chk
 *
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck()  {
		
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("all ducks float,even decoys");
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	
}
