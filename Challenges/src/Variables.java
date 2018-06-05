
public class Variables {
	// Challenge #1:
	// write a java program that reads a number in inches,
	// converts it into meters.
	// note: one inch is 0.0254 meter
	// test data
	// input a value in inch: 1000
	// expect output:
	// 1000.0 inches is 25.4 meters
	
	public static void main(String[] args) {
		double inchVal = 1000;
		double meterVal = (inchVal * 0.0254);
		System.out.println(inchVal + " inches is " + meterVal + " meters.");
	}
}
