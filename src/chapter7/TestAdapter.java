package chapter7;

import chapter7.item.Turkey;
import chapter7.myinterface.Duck;
import chapter7.myinterface.DuckAdapter;

public class TestAdapter {
	
	
	public static void main(String[] argsa) {
		Duck duck = new DuckAdapter(new Turkey());
		duck.quack();
		duck.fly();
	}
}
