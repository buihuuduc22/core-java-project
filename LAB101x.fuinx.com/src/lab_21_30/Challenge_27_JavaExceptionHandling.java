/*@Java Exception Handling
 * Define custom exception
 * 
 * */
package lab_21_30;

import java.util.Scanner;

public class Challenge_27_JavaExceptionHandling {
	public static  MyCalculator cal = new MyCalculator();
	public static  Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("enter n, p: ");
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			try {
				System.out.println(cal.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyCalculator extends Exception {
	public long power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative");
		} else if (n == 0 || p == 0) {
			throw new Exception("n or p should not be zero");
		} else {
			return (long) Math.pow(n, p);
		}
	}
}