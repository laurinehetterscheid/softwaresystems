package ss.week3.pw;

public class TimedPassword extends Password{
	private static final long validTime = System.currentTimeMillis() + 1000 * 60 * 60 * 24; // 1 day in millisecconds
	private boolean expired;
	private long expirationTime;
	private long leftoverTime;
	
	public TimedPassword(long expirationTime) {
		setExpirationTime(expirationTime);
		leftoverTime = validTime - expirationTime;
		
		
	}
	
	public TimedPassword() {
		this.setExpirationTime(System.currentTimeMillis());
	}
	
	
	public boolean isExpired() {
		if (leftoverTime == 0) {
			expired = true;
		}
		else {
			expired = false;
		}
		return expired;
	}
	
	public boolean resetPassword(String oldPass, String newPass) {
		boolean passwordReset = super.setWord(oldPass, newPass);
		
		if (passwordReset) {
			this.setExpirationTime(System.currentTimeMillis() + validTime);
		}
		return passwordReset;
	}

	public long getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(long expirationTime) {
		this.expirationTime = expirationTime;
	}
	

}
