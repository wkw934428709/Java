import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class WeatherData2 extends Observable {

    private	ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

	public WeatherData2() {}

	//超类中已经实现
	// public void registerObserver(Observer ob) {
	// 	observers.add(ob);
	// }

	// public void removeObserver(Observer ob) {
	// 	int i = observers.indexOf(ob);
	// 	if (i >= 0)
	// 		observers.remove(i);
	// }

	// public void notifyObservers() {
	// 	for (int i = 0; i < observers.size(); i++) {
	// 		Observer ob = (Observer)observers.get(i);
	// 		ob.update(temp, humidity, pressure);
	// 	}
	// }

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}


}