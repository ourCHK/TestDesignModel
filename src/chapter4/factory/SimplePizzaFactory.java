package chapter4.factory;

import chapter4.pizza.ChicagoStyleCheesePizza;
import chapter4.pizza.NYStyleCheesePizza;
import chapter4.pizza.Pizza;

public class SimplePizzaFactory {
	
	
	public static enum PIZZATYPE {
		CHEESE,PEPPERONI
	};
	
	public Pizza createPizza (PIZZATYPE type) {
		Pizza pizza = null;
		switch(type) {
		case CHEESE:
			pizza = new ChicagoStyleCheesePizza();
			break;
		case PEPPERONI:
			pizza = new NYStyleCheesePizza();
			break;
		}
		return pizza;
	}
}
