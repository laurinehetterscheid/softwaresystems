package ss.week4.hotel;

public class PricedRoom extends ss.week2.hotel.Room {
	
	private double safePrice;
	private double roomPrice;
	private double nightPrice;
	

	public PricedRoom (int roomNumber, double roomPrice, double safePrice) {
		super(roomNumber, new PricedSafe(safePrice));
		this.safePrice = safePrice;
		this.roomPrice = roomPrice;

	}

	@Override
	public double getAmount() {
		this.nightPrice = roomPrice + safePrice;
		return nightPrice;
	}
	
	public String toString() {
		return ("kamer prijs is: " + roomPrice);
	}

}
