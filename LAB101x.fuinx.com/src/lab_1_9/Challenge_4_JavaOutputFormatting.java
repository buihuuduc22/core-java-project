/*@Java Output Formatting
 * input a string followed by an integer 
 * and then use "printf" to print them by formatted 
 * */
package lab_1_9;

import java.util.Scanner;

public class Challenge_4_JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			System.out.printf("%-15s %03d\n", s1, x);
		}
		System.out.println("================================");
		sc.close();
	}

}
