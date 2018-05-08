/*@Java Subarray
 * input an array get all sub array
 * calculate sum of all subarray's element
 * count all of sum < 0, print count
 * */
package lab_21_30;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge_30_JavaSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//input length of array
		System.out.print("Input length of array: ");
		int n = sc.nextInt();
		int[] A = new int[n];
		//input array
		System.out.print("input array: ");
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = A.length; j >= i; j--) {
				//get sub array (copy element form i-->j-1)
				int[] A1 = Arrays.copyOfRange(A, i, j);
				int sum = 0;
				for (int k = 0; k < A1.length; k++) {
					//calculate sum of sub array
					sum = A1[k] + sum;
				}
				if (sum < 0) {
					count++;
				}
			}
		}
		System.out.println("number of sum<0: "+count);
	}

}
