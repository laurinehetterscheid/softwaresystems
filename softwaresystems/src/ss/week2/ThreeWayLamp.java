package ss.week2;

public class ThreeWayLamp {
	
	public enum brightnessLevel {OFF, LOW, MED, HIGH}
	
	public brightnessLevel light;
	
	public ThreeWayLamp () { 
		light = brightnessLevel.OFF;
	}
	

public brightnessLevel light () {
	return light;
	}


//@ensures this.light == brightnessLevel.OFF || this.light == brightnessLevel.LOW || this.light == brightnessLevel.MED || this.light == brightnessLevel.HIGH;
//@ensures brightnessLevel.LOW == brightnessLevel.OFF;
public void change () {
	switch (light) {
		case OFF:
			light = brightnessLevel.LOW;
			break;
		case LOW:
			light = brightnessLevel.MED;
			break;
		case MED:
			light = brightnessLevel.HIGH;
			break;
		case HIGH:
			light = brightnessLevel.OFF;
			break;
		}
	}
}

