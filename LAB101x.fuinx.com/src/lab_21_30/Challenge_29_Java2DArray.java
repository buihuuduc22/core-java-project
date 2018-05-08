/*@Java 2D Array
 * input an 2D array
 * get  all hourglass in an array and calculate sum of all number in that hourglass
 * print sum largest sum 
 * 
 * */
package lab_21_30;

import java.util.Scanner;

public class Challenge_29_Java2DArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input elements of array: ");
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();
		Sum(arr);

	}

	private static void Sum(int arr[][]) {

		int sum = -100000;
		for (int i = 0; i < 4; i++) {
			for (int x = 0; x < 4; x++) {

				int top = arr[i][x] + arr[i][x + 1] + arr[i][x + 2];
				int middle = arr[i + 1][x + 1];
				int bottom = arr[i + 2][x] + arr[i + 2][x + 1]
						+ arr[i + 2][x + 2];
				if (top + middle + bottom > sum) {
					sum = top + middle + bottom;
				}
			}
		}
		System.out.println("largest sum:  "+sum);

	}
}
