/*@Java String Reverse
 * input a string and check if it is a palindrome print "Yes", print "No" otherwise.
 * */
package lab_10_20;

import java.util.Scanner;

public class Challenge_12_JavaStringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input string: ");
		String A = sc.next();
		sc.close();
		String reverse = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			reverse = reverse + A.charAt(i);
		}
		if (A.equals(reverse)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
