package chapter1;

import chapter1.myDuck.Duck;
import chapter1.myDuck.MallardDuck;
import chapter1.myDuck.ModelDuck;
import chapter1.myDuck.RedHatDuck;
import chapter1.myDuck.ToyDuck;
import chapter1.myimplements.FlyWithRocket;

public class MiniDuckSimulator{
	public static void main(String[] arsg) {
		Duck[] ducks = new Duck[4];
		for(int i=0; i<4; i++) {
			if(i == 0) {
				ducks[i] = new MallardDuck();
			} else if(i == 1) {
				ducks[i] = new RedHatDuck();
			} else if(i == 2){
				ducks[i] = new ToyDuck();
			} else {
				ducks[i]  =new ModelDuck();
				ducks[i].performFly();
				ducks[i].setFlyBehavior(new FlyWithRocket());
			}
			if(i == 3) {
				
			}
			ducks[i].display();
			ducks[i].performFly();
			ducks[i].performQuack();
			ducks[i].swim();
			System.out.println("");
		}
		
		
		
		
		
	}
}
