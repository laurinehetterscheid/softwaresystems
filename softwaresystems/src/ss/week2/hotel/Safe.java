package ss.week2.hotel;

public class Safe {
	
	public boolean activate (String text) {
		return true;
	}
	
	public boolean deactivate () {
		return true;
	}
	
	public boolean open(String text) {
		if (activate(text) == true && text.equals(pass.Password())) {
			return true;
			
		}
	}

}
