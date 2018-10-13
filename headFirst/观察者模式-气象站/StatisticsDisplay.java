
public class StatisticsDisplay implements Observer, DisplayElement{

	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println(" StatisticsDisplay:: pressure = " + pressure);
	}
	
}