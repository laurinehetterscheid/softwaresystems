package ss.week2;

public class Test {
	
	public static void main (String[] argv) {
		ThreeWayLampTest test;
		test = new ThreeWayLampTest();
		test.runTest();
	}
}

class ThreeWayLampTest {
	private ThreeWayLamp signal;
	
	public ThreeWayLampTest () {
		signal = new ThreeWayLamp();
	}
	public void runTest () {
		testInitialState();
		testChange();
	}
	private void testInitialState () {
		System.out.println("testInitialState:");
		System.out.println("Initial light: " + signal.light());
	}
	private void testChange () {
		System.out.println("testChange:");
		System.out.println("Starting light: " + signal.light());
		signal.change();
		System.out.println("After 1 change: " + signal.light());
		signal.change();
		System.out.println("After 2 changes: " + signal.light());
		signal.change();
		System.out.println("After 3 changes: " + signal.light());
		signal.change();
		System.out.println("After 4 changes: " + signal.light());
	}
}