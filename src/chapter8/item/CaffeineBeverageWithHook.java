package chapter8.item;

public abstract class CaffeineBeverageWithHook {
	
	final public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	/**
	 * brew 泡,煮
	 */
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling Water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCondiments() {
		return true;
	}
	
	
}
