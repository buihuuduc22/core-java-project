/*@Java Arraylist
 * input subList and store to superList
 * query to element of sub subList by input locate of them
 * */
package lab_31_36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge_31_JavaArraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input number of sub arraylist: ");
		int noSublist = sc.nextInt();
		List<List<Integer>> superList = new ArrayList<List<Integer>>();
		//input number of sub list
		for (int i = 0; i < noSublist; i++) {
			List<Integer> subList = new ArrayList<Integer>();
		    // input lenght sub arraylist
			int noElement = sc.nextInt();
			// input element sub arraylist
			for (int j = 0; j < noElement; j++) {
				int inElement = sc.nextInt();
				subList.add(inElement);
			}
			superList.add(subList);
		}
		// query element
		int noQueries = sc.nextInt();//number of queries
		//input position of element
		for (int i = 0; i < noQueries; i++) {
			int indexSubArr = sc.nextInt();//index of subArray
			int indexEInSubArr = sc.nextInt();//index of element in sub array
			try {
				int value = superList.get(indexSubArr - 1).get(indexEInSubArr - 1);
				System.out.println(value);
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
			
		}
	}
}
