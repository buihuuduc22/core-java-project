/*@Java Method Overriding 2 (Super Keyword)
 * MotoCycle class extends BiCycle class and override defineMe() method
 * in constructor of MotoCycle called defineMe() method in super class by use super keyword
 * */
package lab_21_30;

public class Challenge_22_JavaMethodOverriding2 {

	public static void main(String[] args) {
		MotoCycle motocycle = new MotoCycle();
	}

}

class BiCycle {
	public String defineMe() {
		return "a vehicle with pedals";
	}
}

class MotoCycle extends BiCycle {
	@Override
	public String defineMe() {
		return "a Cycle with an engine.";
	}

	public MotoCycle() {
		System.out.println("Hello i am a motocyble, i am a " + defineMe());
		System.out.println("Hello i am bicycle, i am a " + super.defineMe());
	}
}
