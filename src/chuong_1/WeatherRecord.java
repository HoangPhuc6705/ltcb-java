package chuong_1;

public class WeatherRecord {
	Date d;
	TemperatureRange today;
	TemperatureRange normal;
	TemperatureRange record;
	double precipitation;
	public WeatherRecord(Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record,
			double precipitation) {
		this.d = d;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
	}
}
