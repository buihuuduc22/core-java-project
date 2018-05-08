package lab_31_36;

import java.util.Scanner;

public class Challenge_35_JavaFactoryPattern {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			//create a foodFactory
			FoodFactory foodFactory = new FoodFactory();
			//input order
			System.out.print("input order (cake, pizza): ");
			//create a Cake or Pizza object
			Food food = foodFactory.getFood(sc.nextLine());
			System.out.println("The factory returned "+food.getClass());
			System.out.println(food.getType());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

interface Food {
	public String getType();
}

class Pizza implements Food {
	@Override
	public String getType() {
		return "Someone ordered a Fast Food!";
	}
}

class Cake implements Food {
	@Override
	public String getType() {
		return "Someone ordered a Dessert!";
	}
}

class FoodFactory{
	public Food getFood(String order) {
		if (order.equalsIgnoreCase("cake")) {
			return new Cake();
		} else if (order.equalsIgnoreCase("pizza")) {
			return new Pizza();
		}
		return null;
	}
}
