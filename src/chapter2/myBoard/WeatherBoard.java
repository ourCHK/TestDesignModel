package chapter2.myBoard;

import chapter2.myInplements.WeatherData;
import chapter2.myInterface.DisplayElements;
import chapter2.myInterface.Observer;

public class WeatherBoard implements Observer,DisplayElements{

	int temp;
	float humidity;
	float pressure;
	WeatherData weatherData;
	
	public WeatherBoard(WeatherData weatherData) {
		this.weatherData = weatherData;
	}
	
	@Override
	public void update(int temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("the weather data is:temp:"+temp+" humidity:"+humidity+" pressure:"+pressure);
	}
		

}
