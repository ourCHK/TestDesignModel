package chapter3;

public class Coffee extends Beverage {

	
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		this.description = "Coffee";
		return description;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 10;
	}

}
