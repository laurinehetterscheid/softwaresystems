package ss.week2.hotel;

public class Safe {
	// ------------------ Instance variables ----------------
	private Password currentPassword;
	private boolean open;
	private boolean active;
	
	
	
	//------------Extra Constructor-----
	public Safe (Password pass) {
		currentPassword = pass;
		open = false;
		active = false;
	}
	
	//------------Constructor-----------
	public Safe () {
		//new Password is een Password object; currentPassword wijst hiernaar.
		currentPassword = new Password();
		open = false;
		active = false;
	}
	
	//------------Commands (Modifiers) --------------
	
	public void activate (String text) {
		// receives a String with a password text and activates the safe if the password is correct.
		if (currentPassword.testWord(text)) {
			active = true;
		}
	}
	
	public void deactivate () {
		// closes the safe and deactivates it.
		open = false;
		active = false;
	}
	
	public void open(String text) {
		// receives a String with a password text, opens the safe if it is active and the password is correct.
		if (currentPassword.testWord(text) && isActive()) {
			open = true;
		}
	}
	
	public void close() {
		// closes the safe, but does not change its activity status.
		open = false;
	}
	
	//-------------Queries (Getters) ---------------
	public boolean isActive() {
		// indicates whether the safe is active.
		return active;
	}
	
	public boolean isOpen() {
		// indicates whether the safe is open.
		return open;
	}
	
	public Password getPassword() {
		// returns the Password object on which the method Password testWord can be called to check the password.
		return currentPassword;
	}
	
	

}
