package ss.week4.hotel;

public class PricedSafe extends ss.week2.hotel.Safe implements ss.week3.bill.Bill.Item {
	private double safePrice;
	
	public PricedSafe(double price) {
		super();
		safePrice = price;
		
	}

	@Override
	public double getAmount() {
		return safePrice;
	}
	
	@Override
	public String toString() {
		return ("kluis prijs is: " + safePrice);
	}

}
