package chapter2;

import chapter2.myBoard.WeatherBoard;
import chapter2.myInplements.WeatherData;

public class TestObserver {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		WeatherBoard weatherBoard = new WeatherBoard(weatherData);
		weatherData.registerObserver(weatherBoard);
		
		weatherData.setMeasuredChanged(100,100,100);
		weatherData.removeObserver(weatherBoard);
		weatherData.setMeasuredChanged(200,200,200);
		weatherData.registerObserver(weatherBoard);
		weatherData.setMeasuredChanged(300,3000,300);
		
	}
}
