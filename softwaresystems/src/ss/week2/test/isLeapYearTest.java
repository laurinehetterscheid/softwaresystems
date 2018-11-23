package ss.week2.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ss.week2.isLeapYear;

public class isLeapYearTest {
	private isLeapYear year;
	private isLeapYear year1;
	private isLeapYear year2;
	private isLeapYear year3;
	
	

	@Before
	public void setUp() {
		year = new isLeapYear(1999);
		year1 = new isLeapYear(2000);
		year2 = new isLeapYear(2001);
		year3 = new isLeapYear(2002);
	}

	@Test
	public void testCorrectLeapYear() {
		assertFalse(year.yearIsLeapYear());
		assertTrue(year1.yearIsLeapYear());
		assertFalse(year2.yearIsLeapYear());
		assertFalse(year3.yearIsLeapYear());
	}

}
