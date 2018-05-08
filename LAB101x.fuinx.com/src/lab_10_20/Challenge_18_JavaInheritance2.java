/*@Java Inheritance II
 * Adder class extends Arithmetic class
 * */
package lab_10_20;

public class Challenge_18_JavaInheritance2 {
	public static void main(String[] args) {
		Adder a = new Adder();
		System.out.println("My superclass is:"
				+ a.getClass().getSuperclass().getName());
		System.out.println(a.Add(10, 20));
	}
}

class Arithmetic {
	int Add(int a, int b) {
		return a + b;
	}
}

class Adder extends Arithmetic {
}
