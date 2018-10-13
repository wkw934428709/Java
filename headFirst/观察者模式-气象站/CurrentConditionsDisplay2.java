import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay2 implements Observer, DisplayElement{

	private float temp;
	private float humidity;
	private float pressure;
	// private Subject weatherData;
	private Observable observalbe;

	public CurrentConditionsDisplay2(Observable observalbe) {
		this.observalbe = observalbe;
		// observalbe.registerObserver(this);
		observalbe.addObserver(this);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData2) {
			WeatherData2 weatherData2 = (WeatherData2)obs;
			this.temp = weatherData2.getTemperature();
			this.humidity = weatherData2.getHumidity();
			display();
		}
	}

	public void display() {
		System.out.println(" CurrentConditionsDisplay2::temp = " + temp + " humidity = " + humidity);
	}
	
}