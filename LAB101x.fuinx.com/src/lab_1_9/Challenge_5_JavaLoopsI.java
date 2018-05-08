/*@Java Loops I
 * input an integer, use for loop to print multiples by formatted
 * n x i = result, i = [1;10]
 * */
package lab_1_9;

import java.util.Scanner;

public class Challenge_5_JavaLoopsI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + i * n);
		}
	}

}
