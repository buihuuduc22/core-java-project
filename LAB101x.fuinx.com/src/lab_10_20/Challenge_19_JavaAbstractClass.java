/*@Java Abstract Class
 * MyBook class extends abstract class book
 * */
package lab_10_20;

import java.util.Scanner;

public class Challenge_19_JavaAbstractClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter title: ");
		String title = sc.nextLine();
		sc.close();
		MyBook newNovel = new MyBook();
		newNovel.setTitle(title);
		System.out.println("The title is: " + newNovel.getTitle());
	}
}
// abstract class
abstract class Book {
	String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	void setTitle(String s) {
		title = s;
	}
}
