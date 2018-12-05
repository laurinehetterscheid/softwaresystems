package ss.week4.hotel;

public class PricedRoom extends ss.week2.hotel.Room implements ss.week3.bill.Bill.Item {
	
	public PricedRoom (int roomNumber, double roomPrice, double safePrice) {
		new PricedSafe(safePrice);
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		// TODO
		return "someString";
	}

}
