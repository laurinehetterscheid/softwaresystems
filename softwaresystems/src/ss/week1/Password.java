package ss.week1;

public class Password {
	public static final String INITIAL = "admin";
	
	public Password () {
		return;
	}
	
	public boolean acceptable (String suggestion) {
		if (suggestion.length() < 6) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean setWord (String oldpass, String newpass) {
		if (oldpass == INITIAL && acceptable(newpass) == true) {
				return true;
			}
		else {
			return false;
		}
	}
	
	public boolean testWord(String test) {
		if (test == INITIAL) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
