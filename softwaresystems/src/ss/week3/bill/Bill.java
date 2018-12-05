package ss.week3.bill;

public class Bill {

	public static interface Item {
		double getAmount();
	}
	
	
	/*
	 * Constructs a Bill sending the output to a given Printer.
	 */
	public Bill(Printer printer) {
	}
	
	/*
	 * Adds an item to this Bill. The item is sent to the printer, and the amount is added to the sum of the Bill
	 * @param item the new item
	 */
	public void addItem(Bill.Item item) {
		
	}
	
	/*
	 * Sends the sum total of the bill to the printer.
	 */
	public void close() {
		
	}
	
	/*
	 * Returns the current sum total of the Bill.
	 */
	public double getSum() {
		return += getAmount;
		// TODO
	}
	
	

}
