package lab_31_36;

public class Challenge_36_JavaSingletonPattern {

	public static void main(String[] args) {
		String test = "Hello World";
		//create a Singleton object
		Singleton object = Singleton.getSingleInstance();
		object.str = test;
		//test whether object created or not
		System.out.println("Hello I am a singleton!"+" "+"Let me say "+object.str+" to you");
	}

}

class Singleton{
	public static Singleton instance;
	//constructor
	private Singleton() {
	}
	public String str;//for test
	public static Singleton getSingleInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
