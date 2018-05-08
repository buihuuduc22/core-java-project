/*@Java If-Else
 * Input n integer and use if-else to check: 
 * - if n is odd, print "Weird".
 * - if n is even and 5 >= n and n >=2, print "Not Weird" 
 * - if n is even and 20 >= n and n >=6, print "Weird"
 * - if n is even and n>20, print "Weird"
 * */
package lab_1_9;

import java.util.Scanner;

public class Challenge_3_JavaIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a interger: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1) {
			ans = "Weird";
		} else {
			if (n <= 5 && n >= 2) {
				ans = "Not Weird";
			}
			if (n <= 20 && n >= 6) {
				ans = "Weird";
			}
			if (n <= 100 && n > 20) {
				ans = "Not Weird";
			}
		}
		System.out.println(ans);
		sc.close();

	}

}
