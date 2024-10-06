package Ex7;

import junit.framework.TestCase;

public class weatherRecordTest extends TestCase {
	public void testConstructor() {
		new weatherRecord(new Date(20, 10, 2024), new TemperatureRange(15, 30), new TemperatureRange(10, 20), new TemperatureRange(30, 40), 8);
	}
}
