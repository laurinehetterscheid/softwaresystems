package ss.week2;

public class TrafficSignal {	
	public enum signalLight {GREEN, ORANGE, RED}
	
	public signalLight light;
	
	public TrafficSignal () { 
		light = signalLight.GREEN;
	}
	

	public signalLight light () {
		return light;
	}


	public void change () {
		switch (light) {
			case GREEN:
				light = signalLight.ORANGE;
				break;
			case ORANGE:
				light = signalLight.RED;
				break;	
			case RED:
				light = signalLight.GREEN;
				break;
		}
	}
}

