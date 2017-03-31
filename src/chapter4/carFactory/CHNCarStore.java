package chapter4.carFactory;

import chapter4.car.Car;
import chapter4.car.QCar;
import chapter4.car.RedFlagCar;

public class CHNCarStore extends CarFactory{

	@Override
	public Car createCar(String type) {
		// TODO Auto-generated method stub
		Car car = null;
		switch(type) {
		case "QCar":
			car = new QCar();
			break;
		case "RedFlagCar":
			car = new RedFlagCar();
			break;
		}
		return car;
	}

}
