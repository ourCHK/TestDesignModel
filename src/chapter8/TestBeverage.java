package chapter8;

import chapter8.item.CoffeeWithHook;
import chapter8.item.Tea;

public class TestBeverage {
	public static void main(String[] arhs) {
		Tea tea = new Tea();
		tea.prepareRecipe();
		
		CoffeeWithHook coffee = new CoffeeWithHook();
		coffee.prepareRecipe();
	}
}
