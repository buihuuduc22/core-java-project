/*@Java Instanceof keyword
 * input an integer t is number of object from one of three class:
 * Student, Rockstar, Hacker and store these object in myList
 * use instanceof keword to test each object is an instance of which class
 * and count them by count() method and print amount of object of each class. 
 * 
 * */
package lab_21_30;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge_23_JavaInstanceofkeyword {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		Scanner sc = new Scanner(System.in);
		Instance ins = new Instance();
		System.out.print("Enter t: ");
		int t = sc.nextInt();
		System.out.print("enter Student, Rockstar, Hacker: ");
		for (int i = 0; i < t; i++) {
			String s = sc.next();
			if(s.equals("Student"))myList.add( new Student());
			if(s.equals("Rockstar"))myList.add( new Rockstar());
			if(s.equals("Hacker"))myList.add( new Hacker());
		}
		System.out.println(ins.count(myList));
	}
	
}

class Student {
}

class Rockstar {
}

class Hacker {
}

class Instance {
	static String count(ArrayList mylist) {
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < mylist.size(); i++) {
			Object element = mylist.get(i);
			if (element instanceof Student)
				a++;
			if (element instanceof Rockstar)
				b++;
			if (element instanceof Hacker)
				c++;
		}
		String ret = Integer.toString(a) + " " + Integer.toString(b) + " "
				+ Integer.toString(c);
		return ret;
	}
}