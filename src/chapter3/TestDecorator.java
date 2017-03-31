package chapter3;

public class TestDecorator {
	
	public static void main(String[] args) {
		Beverage coffee = new Coffee();
		Beverage milk = new Milk(coffee);
		Beverage candy = new Candy(milk);
		Beverage monca = new Monca(candy);
		
		System.out.println("牛奶的单价："+(new Milk()).cost());
		
		System.out.println("咖啡的价格："+coffee.cost());
		System.out.println("修饰牛奶之后饮料价格："+milk.cost());
		System.out.println("修饰牛奶，糖之后饮料的价格："+candy.cost());
		System.out.println("修饰牛奶，糖，抹茶之后饮料的价格："+monca.cost());
		System.out.println("描述："+ monca.getDescription()+"\n");
		
		
		Beverage mix = new Coffee();
		mix = new Milk(mix);
		mix = new Monca(mix);
		mix = new Candy(mix);
		System.out.println("价格:"+mix.cost()+"  描述："+mix.getDescription());
	}  
} 
