/*@Java Stdin and Stdout I:
 * input 3 integer then print them to console
 * */
package lab_1_9;

import java.util.Scanner;

public class Challenge_2_JavaStdinAndStdoutI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		scan.close();
	}

}
