/*@Java Datatypes
 * input an integer and then check what primitive data types can store it;
 * if number cannot stored in one of the four primitive (byte, short, int, long)
 * print " can't be fitted anywhere";
 * */
package lab_1_9;

import java.util.Scanner;

public class Challenge_6_JavaDatatypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			try {
				long x = sc.nextLong();
				if (x >= Math.pow(-2, 7) && x <= (Math.pow(2, 7)) - 1)
					System.out.println("* byte");
				if (x >= Math.pow(-2, 15) && x <= (Math.pow(2, 15)) - 1)
					System.out.println("* short");
				if (x >= Math.pow(-2, 31) && x <= (Math.pow(2, 31)) - 1)
					System.out.println("* int");
				if (x >= Math.pow(-2, 63) && x <= (Math.pow(2, 63)) - 1)
					System.out.println("* long");
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
				sc.close();
			}
		}
	}

}
