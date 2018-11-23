package ss.week2;

public class isLeapYear {
	private boolean aLeapYear;
	private int year;
	
	public isLeapYear(int aYear) {
		year = aYear;
		
	}

	public boolean yearIsLeapYear() {
		
		if (year % 4 == 0) {
			
			if (year % 100 == 0) {
				// if divisible by 100,
				// must also be divisible by 400
				
				aLeapYear = (year % 400 == 0);
			}
			else {
				//divisible by 4, not by 100
				aLeapYear = true;
			}
		}
		else {
			// not divisible by 4
			
			aLeapYear = false;
		}
		return aLeapYear;
	}
	
}
