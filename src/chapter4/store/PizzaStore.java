package chapter4.store;

import chapter4.factory.SimplePizzaFactory;
import chapter4.factory.SimplePizzaFactory.PIZZATYPE;
import chapter4.pizza.Pizza;

public abstract class PizzaStore {
	public SimplePizzaFactory pizzaFactory;
	
	public PizzaStore(SimplePizzaFactory pizzaFactory) {
		this.pizzaFactory = pizzaFactory;
	}
	
	public void orderPizza(String type) {
		Pizza pizza =  createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	} 
	
	public abstract Pizza createPizza(String type);
	
}
