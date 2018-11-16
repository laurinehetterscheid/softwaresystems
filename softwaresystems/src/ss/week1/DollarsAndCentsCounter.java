package ss.week1;

public class DollarsAndCentsCounter {
	
	private int dollars;
	private int cents;
	

	//public DollarsAndCentsCounter (int dollarValue, int centsValue) {
	//	setDollars(dollarValue);
	// 	setCents (centsValue);
	//}

	public int dollars() {
		//getDollars
		return dollars;
	}

	public void setDollars(int dollars) {
		//grey dollar is input dollar
		
		if (dollars >= 0) {
			this.dollars = dollars;
		}
		else {
			this.dollars = 0;
		}
	}

	public int cents() {
		//getCents
		return cents;
	}

	public void setCents(int cents) {
		if (0 <= cents && cents <= 99) {
			this.cents = cents;
		}
		else if (cents >= 100) {
			this.dollars += 1;
			setCents(cents-100);
		}
		else {
			this.cents = 0;
		}
	}
	
	public void add(int dollars, int cents) {
		setDollars(this.dollars + dollars);
		setCents(this.cents + cents);
		
	}
	
	public void reset () {
		this.dollars = 0;
		this.cents = 0;
	}

}
