package ss.week3.bill;


public class StringPrinter implements Printer {
	private String printString;
	

	@Override
	public void printLine(String text, double price) {
		printString += format(text, price);
	}
	
	public String getResult() {
		return printString;
	}

}
