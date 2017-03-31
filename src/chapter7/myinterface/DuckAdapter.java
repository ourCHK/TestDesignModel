package chapter7.myinterface;

import chapter7.item.Turkey;

public class DuckAdapter implements Duck{

	Turkey turkey;
	
	public DuckAdapter(Turkey turkey)  {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		turkey.quack();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		turkey.fly();
	}

}
