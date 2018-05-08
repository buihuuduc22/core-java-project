/*@Java String Tokens
 * input a string s matching regular expression [A-Za-z !,?._'@]+
 * split s into tokens  
 * print number of tokens
 * */
package lab_10_20;

import java.util.Scanner;

public class Challenge_14_JavaStringTokens {

	public static void main(String[] args) {
		//input string
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		//split string by regular expression
		String[] str = s.trim().split("[ !,?\\._'@]+", 0);
		if (str.length == 1 && str[0].equals("")) {
			System.out.println(0);
		} else {
			System.out.println(str.length);
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
		}

	}

}
