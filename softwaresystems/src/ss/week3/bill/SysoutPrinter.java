package ss.week3.bill;

public class SysoutPrinter implements Printer{
	
	public static void main(String[] var0) {
		SysoutPrinter p = new SysoutPrinter();
        p.printLine("Text1", 1.0);
        p.printLine("Other text", -12.1212);
        p.printLine("Something", .2);
	}


	@Override
	public void printLine(String text, double price) {
		System.out.print(format(text, price));	
	}

}
