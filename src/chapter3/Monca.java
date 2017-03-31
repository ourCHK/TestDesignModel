package chapter3;

public class Monca extends Beverage {

	Beverage isDecorated;
	
	public Monca(Beverage beverage) {
		isDecorated = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		if(null == isDecorated) 
			return "Monca";
		return "Monca,"+isDecorated.getDescription();
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(null == isDecorated) {
			return 40;
		}
		return 40+isDecorated.cost();
	}

}
