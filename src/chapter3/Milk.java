package chapter3;

public class Milk extends Beverage {

	/**
	 * 被装饰的物品
	 */
	Beverage isDecorated;
	
	public Milk() {
		
	}
	
	public Milk(Beverage beverage) {
		this.isDecorated = beverage;
	}
	
	@Override
	public String getDescription() {
		if(null == isDecorated ) {
			return "MILK";
		}
		return "MILk,"+isDecorated.getDescription();
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(null == isDecorated) {
			return 20;
		}
		return 20+isDecorated.cost();
	}

}
