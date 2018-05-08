/*@Java Strings Introduction
 * input two string A, B and compare them
 * print capitalize of A and B, separated by a space
 * */
package lab_10_20;

import java.util.Scanner;

public class Challenge_10_JavaStringsIntroduction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input two string lowercase
		String A = sc.next();
		String B = sc.next();
		//return sum of length and compare A, B
		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		//convert A, B to capitalize separated by space
		System.out.println(A.substring(0, 1).toUpperCase()
				+ A.substring(1).toLowerCase() + " "
				+ B.substring(0, 1).toUpperCase()
				+ B.substring(1).toLowerCase());
		sc.close();
	}

}
