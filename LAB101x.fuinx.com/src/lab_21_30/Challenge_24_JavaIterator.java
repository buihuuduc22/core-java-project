/*@Java Iterator
 * mylist is arraylist of interger and string separate by "#####"
 * use iterator to loop through a mylist and print elements string
 * func() method in Main class return a iterator string in mylist
 *  
 * */
package lab_21_30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Challenge_24_JavaIterator {

	public static void main(String[] args) {
		//describe list: 1,2,3 ### a,b,c,d
		//print all string after ###
		ArrayList mylist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("input number of integer you want to my list: ");
		int n = sc.nextInt();
		System.out.println("input number of String you want to my list: ");
		int m = sc.nextInt();
		System.out.println("input integer: ");
		for (int i = 0; i < n; i++) {
			mylist.add(sc.nextInt());
		}

		mylist.add("###");
		System.out.println("input String: ");
		for (int i = 0; i < m; i++) {
			mylist.add(sc.next());
		}

		Iterator it = Main.func(mylist);
		while (it.hasNext()) {
			Object element = (Object) it.next();
			System.out.println((String) element);
		}
	}
}


class Main {
	public static Iterator func(ArrayList mylist) {
		Iterator it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			if (element instanceof String)
				break;
		}
		return it;
	}
}
