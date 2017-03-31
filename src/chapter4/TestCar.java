package chapter4;

import chapter4.car.Car;
import chapter4.carFactory.CHNCarStore;
import chapter4.carFactory.ForeignCarStore;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new CHNCarStore().createCar("QCar");
		car.drive();
		
		car = new CHNCarStore().createCar("RedFlagCar");
		car.drive();
		
		car = new ForeignCarStore().createCar("BenZCar");
		car.drive();
		
		car = new ForeignCarStore().createCar("BMWCar");
		car.drive();
	}

}
