package chapter4.carFactory;

import chapter4.car.BMWCar;
import chapter4.car.BenZCar;
import chapter4.car.Car;
import chapter4.car.XTLCar;

public class ForeignCarStore extends CarFactory{

	@Override
	public Car createCar(String type) {
		// TODO Auto-generated method stub
		Car car =  null;
		
		switch(type) {
		case "BenZCar":
			car = new BenZCar();
			break;
		case "BMWCar":
			car = new BMWCar();
			break;
		case "XTLCar":
			car = new XTLCar();
			break;
		}		
		return car;
	}

}
