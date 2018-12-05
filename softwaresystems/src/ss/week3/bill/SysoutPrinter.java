package ss.week3.bill;

public class SysoutPrinter implements Printer{
	
	public static void main(String[] args) {
	}

	@Override
	public String format(String text, double price) {
		return String.format(text, price) + "/n";
	}

	@Override
	public void printLine(String text, double price) {
		System.out.print(text);
		System.out.printf("%2d", price);		
	}

}
