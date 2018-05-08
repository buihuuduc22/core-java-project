/*@Java 1D Array
 * input element for array and print them
 * */
package lab_21_30;

import java.util.Scanner;

public class Challenge_28_Java1DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input length of array: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
