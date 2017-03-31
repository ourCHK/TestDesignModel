package chapter3;

public class Candy extends Beverage {

	Beverage isDecorated;
	
	public Candy(Beverage beverage) {
		this.isDecorated = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(null == isDecorated) {
			return "Candy";
		}
		return "Candy,"+isDecorated.getDescription();
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(null == isDecorated) {
			return 30;
		}
		return 30+isDecorated.cost();
	}

}
