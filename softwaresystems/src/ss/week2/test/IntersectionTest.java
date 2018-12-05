package ss.week2.test;

import ss.week2.Intersection;

public class IntersectionTest {
	public static void main (String[] argv) {
		KruisingTest test;
		test = new KruisingTest();
		test.runIntersectionTest();
	}
}

class KruisingTest {
	private Intersection intersection;
	
	public KruisingTest () {
		intersection = new Intersection();
	}
	public void runIntersectionTest () {
		testInitialState();
		testChange();
	}
	private void testInitialState () {
		System.out.println("testInitialState:");
		System.out.println("Initial light EW: " + intersection.trafficSignalEastWest().light());
		System.out.println("Initial light NS"
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ": " + intersection.trafficSignalNorthSouth().light());
		
	}
	private void testChange () {
		System.out.println("testChange:");
		System.out.println("Starting light EW: " + intersection.trafficSignalEastWest().light() + " " + "Starting light NS: " + intersection.trafficSignalNorthSouth().light());
		intersection.change();
		System.out.println("After 1 change EW: " + intersection.trafficSignalEastWest().light() + " " + "-----> NS: " + intersection.trafficSignalNorthSouth().light());
		intersection.change();
		System.out.println("After 2 changes EW: " + intersection.trafficSignalEastWest().light() + " " + "-----> NS: " + intersection.trafficSignalNorthSouth().light());
		intersection.change();
		System.out.println("After 3 changes EW: " + intersection.trafficSignalEastWest().light() + " " + "-----> NS: " + intersection.trafficSignalNorthSouth().light());
		intersection.change();
		System.out.println("After 4 changes EW: " + intersection.trafficSignalEastWest().light() + " " + "-----> NS: " + intersection.trafficSignalNorthSouth().light());
	}
}

