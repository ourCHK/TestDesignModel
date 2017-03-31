package chapter4.pizza;

public abstract class Pizza {
	String name;
	String dough;	//添加生面团
	String sauce;	//添加调味酱
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough");
		System.out.println("adding toppings");	//添加顶部糕点
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void  cut() {
		System.out.println("cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place the pizza in the offical PizzaStore Box");
	}
	
	public String getName() {
		return name;
	}
	
}
