package chapter2.myInplements;

import java.util.ArrayList;
import java.util.List;

import chapter2.myInterface.Observer;
import chapter2.myInterface.Subject;

public class WeatherData implements Subject {

	int temp;
	float humidity;
	float pressure;
	List<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(o);
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0; i<observers.size(); i++) {
			observers.get(i).update(temp, humidity, pressure);
		}
	}

	public void setMeasuredChanged(int temp,float humidity,float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}
	
	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	

}
