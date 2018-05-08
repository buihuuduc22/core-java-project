/*@Java Substring Comparisons
 * input a string S and an integer K 
 * get all substrings of S with length is K, find smallest and largest substring.  
 * */
package lab_10_20;

import java.util.Scanner;

public class Challenge_11_JavaSubstringComparisons {
	//find substring smallest and largest form all substring of s with k letter
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		try {
			for (int i = 0; i < s.length(); i++) {
				String subString = s.substring(i, i + k);
				if (i == 0) {
					smallest = subString;
				}
				if (subString.compareTo(largest) > 0) {
					largest = subString;
				} else if (subString.compareTo(smallest) < 0) {
					smallest = subString;
				}
				if(i==s.length()-3) break;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return smallest + "\n" + largest;
	}
	
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			//input s and k
			System.out.print("input s and k: ");
			String s = scan.next();
			int k = scan.nextInt();
			scan.close();
			System.out.println(getSmallestAndLargest(s, k));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
