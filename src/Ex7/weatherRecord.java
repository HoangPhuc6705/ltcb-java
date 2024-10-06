package Ex7;

public class weatherRecord {
	Date date;
	TemperatureRange today;
	TemperatureRange normal;
	TemperatureRange record;
	double precipitation;

	public weatherRecord(Date date, TemperatureRange today, TemperatureRange normal, TemperatureRange record, double preci) {
		this.date = date;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = preci;
	}

}
