package ss.week3.pw;

public class TimedPassword extends Password{
	private static final long validTime = 1000 * 60 * 60 * 24; // 1 day in millisecconds
	private boolean expired;
	private long expirationTime;
	private long leftoverTime;
	
	public TimedPassword(long expirationTime) {
		this.expirationTime = System.currentTimeMillis() + expirationTime * 1000;	
		
		// System.out.println("Expiration time is: " + this.expirationTime);
	}
	
	public TimedPassword() {
		this.expirationTime = validTime;
	}
	
	
	public boolean isExpired() {
		leftoverTime = this.expirationTime - System.currentTimeMillis();
		
		/* System.out.println("Leftover time is: " + leftoverTime);
		* System.out.println("Valid time is: " + validTime);
		* System.out.println("Expiration time is: " + this.expirationTime);
		*System.out.println("Current time is: " + System.currentTimeMillis());
		*/
		
		if (leftoverTime <= 0) {
			expired = true;
		}
		else {
			expired = false;
		}
		return expired;
	}
	
	@Override
	public boolean setWord(String oldPass, String newPass) {
		boolean passwordReset = super.setWord(oldPass, newPass);
		
		if (passwordReset) {
			this.expirationTime = System.currentTimeMillis() + validTime;
		}
		return passwordReset;
	}


	

}
