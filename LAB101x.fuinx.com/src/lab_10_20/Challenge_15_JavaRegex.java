/*@Java Regex
 * input an string and then check if it is
 * */
package lab_10_20;

import java.util.Scanner;

public class Challenge_15_JavaRegex {

	public static void main(String[] args) {
		//pattern for ip address
		//A.B.C.D; A, B, C,D range 0-255 and length cannot greater than 3
		String pattern = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
		Scanner sc = new Scanner(System.in);
		System.out.print("input ip: ");
		while (sc.hasNext()) {
			String ip = sc.next();
			System.out.println(ip.matches(pattern));
		}
		sc.close();
	}

}
