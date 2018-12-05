package ss.week3.pw;

public class BasicChecker implements Checker {
	
	public static final String INITPASS = "admin";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public boolean acceptable (String suggestion) {
		return !(suggestion.length() < 6 || suggestion.contains(" "));
	}

	@Override
	public String generatePassword() {
		return "someString";
	}

}
