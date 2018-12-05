package ss.week3.bill;

public class StringPrinter implements Printer {
	private String string = "";

	
	@Override
	public String format(String text, double price) {
		return String.format(text, price) + "/n";
	}


	@Override
	public void printLine(String text, double price) {
		this.string += this.format(text, price);
	}
	
	public String getResult() {
		return string;
	}

}
