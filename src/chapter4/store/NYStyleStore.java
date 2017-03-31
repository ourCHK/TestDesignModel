package chapter4.store;

import chapter4.factory.SimplePizzaFactory;
import chapter4.ingredient.Cheese;
import chapter4.ingredient.Clams;
import chapter4.ingredient.Dough;
import chapter4.ingredient.Pepperoni;
import chapter4.ingredient.Sauce;
import chapter4.ingredient.Veggies;
import chapter4.myinterface.PizzaIngredientFactory;
import chapter4.pizza.NYStyleCheesePizza;
import chapter4.pizza.Pizza;

public class NYStyleStore extends PizzaStore implements PizzaIngredientFactory{

	public NYStyleStore(SimplePizzaFactory pizzaFactory) {
		super(pizzaFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		switch(type){
		case "cheese":
			pizza = new NYStyleCheesePizza();
			break;
		case "pepperoni":
			
			break;
		}
		return pizza;
	}

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clams createClaam() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
