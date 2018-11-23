package ss.week2;

public class Intersection {
	private TrafficSignal eastWest;
	private TrafficSignal northSouth;
	
	
	public Intersection () {
		eastWest = new TrafficSignal();
		northSouth = new TrafficSignal();
		northSouth.change();
		northSouth.change();
	}
	
	public void change () {
		if (northSouth.light == TrafficSignal.signalLight.GREEN) {
			northSouth.change();
		}
		else if (eastWest.light == TrafficSignal.signalLight.GREEN) {
			eastWest.change();
		}
		else {
			northSouth.change();
			eastWest.change();
		}
	}
	
	public TrafficSignal trafficSignalEastWest() {
		return eastWest;
	}
	
	public TrafficSignal trafficSignalNorthSouth() {
		return northSouth;
	}

}
