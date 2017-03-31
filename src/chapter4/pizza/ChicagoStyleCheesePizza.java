package chapter4.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		this.name = "Chicago Style deep Dish Cheese Pizza";
		this.dough = "Extra thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cutting the pizza into the square slices");
	}
	
	
}
