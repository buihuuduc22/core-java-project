/*@Java Anagrams
 * input two string a, b, check a and b are anagrams or not
 * two string a, b are called anagrams: 
 * if they contain all the same characters and same frequencies
 * */
package lab_10_20;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge_13_JavaAnagrams {
	//check two string is anagrams or not
	//two string is anagrams if they contains all the same character in the same frequencies
	static boolean isAnagram(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		boolean flag = false;
		//convert string to char array
		char[] c = a.toCharArray();
		Arrays.sort(c);
		char[] d = b.toCharArray();
		Arrays.sort(d);
		//convert char array to string
		String A = new String(c);
		String B = new String(d);
		//compare two string
		if (A.equals(B)) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//input two string
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}
