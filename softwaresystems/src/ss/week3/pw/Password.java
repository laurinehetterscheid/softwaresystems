package ss.week3.pw;

public class Password {
	private Checker checker;
	private String factoryPassword;
	
	public static final String INITIAL = "admin";
	
	public Password (Checker someChecker) {
		factoryPassword = INITIAL;
		checker = someChecker;
	}
	
	public Password() {
		 this(new BasicChecker());
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
				factoryPassword = newpass;
				return true;
			}
		else {
			return false;
		}
	}
	
	public boolean testWord(String test) {
		if (factoryPassword.equals(test)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Checker getChecker() {
		return checker;
	}
	
	public String getFactoryPassword() {
		return factoryPassword;
	}
	

}
