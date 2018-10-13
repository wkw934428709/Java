import java.util.ArrayList;

public class WeatherData implements Subject {

    private	ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer ob) {
		observers.add(ob);
	}

	public void removeObserver(Observer ob) {
		int i = observers.indexOf(ob);
		if (i >= 0)
			observers.remove(i);
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer ob = (Observer)observers.get(i);
			ob.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
}