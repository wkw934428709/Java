
/*
观察者模式
观察者 向 主题 注册，主题回掉观察者的回掉方法
主题实现add，remove，notify接口
观察者实现notify接口

2.0版本用继承代替了接口，2.0中也改变了获取的方式，通过拉的方式获得数据

*/

public class Main {
	public static void main(String[] args) {
		//接口实现
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay ccDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay sDispaly = new StatisticsDisplay(weatherData);

		weatherData.setMeasurements(11, 22, 33);
		weatherData.setMeasurements(99, 55, 88);

		//2.版 继承
		WeatherData2 weatherData2 = new WeatherData2();
		CurrentConditionsDisplay2 ccDisplay2 = new CurrentConditionsDisplay2(weatherData2);
		// StatisticsDisplay sDispaly = new StatisticsDisplay(weatherData);

		weatherData2.setMeasurements(222, 777, 666);
	}
}