package chapter4.myinterface;

import chapter4.ingredient.Cheese;
import chapter4.ingredient.Clams;
import chapter4.ingredient.Dough;
import chapter4.ingredient.Pepperoni;
import chapter4.ingredient.Sauce;
import chapter4.ingredient.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClaam();
}
