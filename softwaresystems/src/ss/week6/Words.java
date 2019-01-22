package ss.week6;

import java.util.Scanner;

public class Words {
	private static Scanner in;

	public static void main (String args[]) {

		String printWords = "";
		in = new Scanner (System.in);
		

		do { 
			System.out.println("\nGive a random sentence to be split");
			printWords = in.nextLine();
			for (String s : printWords.split(" ")) {
				if (!printWords.isEmpty()) {
					System.out.println(s);
				}
			}
		}
		while (!printWords.startsWith("end"));
		System.out.println("\nEnd of programme");
	}
}
