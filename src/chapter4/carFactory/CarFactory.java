package chapter4.carFactory;

import chapter4.car.Car;

public abstract class CarFactory {
	public abstract Car createCar(String type);
}
