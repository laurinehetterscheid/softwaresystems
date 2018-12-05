package ss.week3.pw;


public class StrongChecker extends BasicChecker{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean acceptable(String suggestion) {
		char char0 = suggestion.charAt(0);
		char charEnd = suggestion.charAt(suggestion.length()-1);
		
		if(super.acceptable(suggestion) == false) {
			return false;
		}
		
		return Character.isLetter(char0) && Character.isDigit(charEnd);
	}
}
