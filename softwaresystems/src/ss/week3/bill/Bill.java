package ss.week3.bill;

public class Bill {
	public StringPrinter printer;
	private double billTotal = 0;
	
	
	
	//--------- INTERFACE ----------//
	public static interface Item {
		double getAmount();
	}
	
	//--------- CONSTRUCTOR ----------//
	/*
	 * Constructs a Bill sending the output to a given Printer.
	 */
	public Bill(StringPrinter printer) {
		this.printer = printer;
		billTotal = 0;
	}
	
	
	
	/*
	 * Adds an item to this Bill. The item is sent to the printer, and the amount is added to the sum of the Bill
	 * @param item the new item
	 */
	public void addItem(Bill.Item item) {
		printer.printLine(item.toString(), item.getAmount());
		billTotal += item.getAmount();
		
	}
	
	/*
	 * Sends the sum total of the bill to the printer.
	 */
	public void close() {
		printer.printLine("Total price: ", billTotal);
	}
	
	/*
	 * Returns the current sum total of the Bill.
	 */
	public double getSum() {
		return billTotal;
	}
	
	

}
