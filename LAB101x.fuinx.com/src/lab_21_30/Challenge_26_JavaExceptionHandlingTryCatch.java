/*@Java Exception Handling (Try-catch)
 * Handle exception
 * */
package lab_21_30;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Challenge_26_JavaExceptionHandlingTryCatch {
	public static void main(String[] args) {

		try {
			System.out.println("Enter 2 integer: ");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			int y = sc.nextInt();
			sc.close();
			int z = x / y;
			System.out.println(z);
		} catch (InputMismatchException e) {
			System.out.println(e.getClass().toString().substring(6));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
