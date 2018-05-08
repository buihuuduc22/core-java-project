/*@Java BigInteger
 * input two big integers and then  add and multiply them. 
 * */
package lab_10_20;

import java.math.BigInteger;
import java.util.Scanner;

public class Challenge_16_JavaBigInteger {
	public static void main(String[] args) {
		//create BigInteger
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two BigInteger: ");
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		sc.close();
		//add, multiply two BigInteger
		System.out.println("Add: "+a.add(b));
		System.out.println("Multiply: "+a.multiply(b));
	}
}
