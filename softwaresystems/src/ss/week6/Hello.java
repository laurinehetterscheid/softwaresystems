/**
 * 
 */
package ss.week6;

import java.util.Scanner;

/**
 * @author laurine.hetterscheid
 *
 */
public class Hello {
	private static Scanner in;

	public static void main (String args[]) {
		
		String printName = "";
		in = new Scanner (System.in);
		
		do {
			System.out.print("What is your name?");
			printName = in.nextLine();
			if (!printName.isEmpty()) {
					System.out.println("Hello " + printName);
			}
		}
		
		while (!printName.isEmpty());
			System.out.print("Bye!");
		}
}
