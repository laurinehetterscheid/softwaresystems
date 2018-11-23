package ss.week2.test;

import ss.week2.TrafficSignal;

public class TrafficTest {	
	public static void main (String[] argv) {
		TrafficSignalTest test;
		test = new TrafficSignalTest();
		test.runTrafficTest();
	}
}

class TrafficSignalTest {
	private TrafficSignal signal;
	
	public TrafficSignalTest () {
		signal = new TrafficSignal();
	}
	public void runTrafficTest () {
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