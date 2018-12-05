package ss.week3.bill;

public class Bill {
	public Printer printer;
	private double sum = 0;

	public static interface Item {
		double getAmount();
		String getString();
	}
	
	
	/*
	 * Constructs a Bill sending the output to a given Printer.
	 */
	public Bill(Printer printer) {
		this.printer = printer;
	}
	
	/*
	 * Adds an item to this Bill. The item is sent to the printer, and the amount is added to the sum of the Bill
	 * @param item the new item
	 */
	public void addItem(Bill.Item item) {
		printer.printLine(item.getString(), item.getAmount());
		sum += item.getAmount();
		
	}
	
	/*
	 * Sends the sum total of the bill to the printer.
	 */
	public void close() {
		printer.printLine("final price", sum);
		sum = 0;
	}
	
	/*
	 * Returns the current sum total of the Bill.
	 */
	public double getSum() {
		return sum;
	}
	
	

}
