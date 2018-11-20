package ss.week2.hotel;

public class Password {
	private String pass;
	
	public static final String INITIAL = "admin";
	
	public Password () {
		pass = INITIAL;
	}
	
	public boolean acceptable (String suggestion) {
		if (suggestion.length() < 6 || suggestion.contains(" ")) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean setWord (String oldpass, String newpass) {
		if (testWord(oldpass) && acceptable(newpass)) {
				pass = newpass;
				return true;
			}
		else {
			return false;
		}
	}
	
	public boolean testWord(String test) {
		if (pass.equals(test)) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
