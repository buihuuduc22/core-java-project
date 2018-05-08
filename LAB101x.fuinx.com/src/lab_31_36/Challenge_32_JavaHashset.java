package lab_31_36;

import java.util.HashSet;
import java.util.Scanner;

public class Challenge_32_JavaHashset {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//input number of pair String
		System.out.print("input number of String: ");
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];
		//input string left and right
		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < t; i++) {
			//ex: abc, def
			hs.add(pair_left[i] + ", " + pair_right[i]);
			//print number of pair after taking pair as input
			System.out.println(hs.size());
		}
	}

}
