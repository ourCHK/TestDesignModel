package chapter4;

import chapter4.pizza.Pizza;
import chapter4.store.NYStyleStore;

public class TestPizza {
	public static void main(String[] args) {
		new NYStyleStore(null).orderPizza("cheese");
	}
}
