/*@Java Interface
 * class MyCalculator implements interface AdvancedArithmetic
 * get input an integer
 * divisorSum method return sum of all integer's divisors
 * */
package lab_10_20;

import java.util.Scanner;

public class Challenge_20_JavaInterface {
	public static void main(String[] args) {
		MyCalculator myCaculator = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.println("sum of divisor: "+myCaculator.divisorSum(n));
		sc.close();
	}
}

// interface
interface AdvancedArithmetic {
	int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic {
	//calculate sum of divisor
	public int divisorSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int z = n % i;
			if (z == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
