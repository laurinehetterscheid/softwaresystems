package ss.week2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import ss.week2.hotel.Safe;
import ss.week2.hotel.Password;

public class SafeTest {
	private Safe safe;
	private String correctPassword;
    private String wrongPassword;
	

	@Before
	public void setUp() {
		safe = new Safe();
		correctPassword = Password.INITIAL;
	    wrongPassword = "stom_wachtwoord";
	}
	
	@Test
	public void testInitiate () {
		assertFalse(this.safe.isOpen());
		assertFalse(this.safe.isActive());
	}
	
	@Test
	public void testActivateAndOpenSafe () {
		safe.activate(correctPassword);
		assertTrue(this.safe.isActive());

		safe.open(correctPassword);
		assertTrue(this.safe.isOpen());
	}

	
	@Test
	public void testActivateWrongPassword() {
		safe.activate(wrongPassword);
		assertFalse(this.safe.isActive());
		}
}
