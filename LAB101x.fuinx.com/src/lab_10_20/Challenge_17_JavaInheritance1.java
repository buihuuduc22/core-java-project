/*@Java Inheritance I
 * use inheritance to Bird object can call methods from Animal class
 * */
package lab_10_20;

public class Challenge_17_JavaInheritance1 {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}

// class animal
class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

// class bird inheritance from animal
class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}

	void sing() {
		System.out.println("I am singing");
	}
}
