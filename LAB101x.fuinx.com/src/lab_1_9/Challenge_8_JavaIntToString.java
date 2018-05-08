/*@Java Int to String
 * input an integer, covert integer to String
 * and then convert that String to integer 
 * */
package lab_1_9;

import java.util.Scanner;

public class Challenge_8_JavaIntToString {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			String s = String.valueOf(n);
			if (n == Integer.parseInt(s)) {
				System.out.println("Good job");
			} else {
				System.out.println("Wrong answer.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
