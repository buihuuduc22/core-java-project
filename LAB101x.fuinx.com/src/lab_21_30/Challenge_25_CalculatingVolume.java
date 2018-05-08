/*@Calculating Volume
 * Challenge to calculating volume of cuboid, hemisphere, cube, cylinder
 * Calculate class define formula get volume and method to get input
 * */
package lab_21_30;

import java.io.IOException;
import java.util.Scanner;

public class Challenge_25_CalculatingVolume {
	public static void main(String[] args) {
		try {
			Calculate cal = new Calculate();
			System.out.println("input number of test case: ");
			int T = cal.get_int_val();
			while (T-- > 0) {
				System.out.println("input your choice:\n"+
								 "1. volume of cube\n"+
								 "2. volume of cuboid\n"+
								 "3. volume of hemisphere\n"+
								 "4. voume of cylinder");
				double volume = 0.0;
				int ch = cal.get_int_val();
				if (ch == 1) {
					//details cube
					System.out.println("input a: ");
					int a = cal.get_int_val();
					volume = Calculate.do_calc().get_volume(a);
				} else if (ch == 2) {
					//details cuboid
					System.out.println("input l, b, h: ");
					int l = cal.get_int_val();
					int b = cal.get_int_val();
					int h = cal.get_int_val();
					volume = Calculate.do_calc().get_volume(l, b, h);
				} else if (ch == 3) {
					//details hemisphere
					System.out.println("input r: ");
					double r = cal.get_double_val();
					volume = Calculate.do_calc().get_volume(r);
				} else if (ch == 4) {
					//details cylinder
					System.out.println("input r, h:");
					double r = cal.get_double_val();
					double h = cal.get_double_val();
					volume = Calculate.do_calc().get_volume(r, h);
				}
				//display volume
				cal.output.display(volume);
				System.out.println("----------------------------------------");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

// class calculate
class Calculate {
	static Calculate output;

	Scanner in = new Scanner(System.in);
	//get double input from keyboard
	double get_double_val() throws IOException {
		double value = in.nextDouble();
		if (value <= 0) {
			throw new NumberFormatException("All the values must be positive");
		}
		return value;
	}
	//get int input from keyboard
	int get_int_val() throws IOException {
		int value = in.nextInt();
		if (value <= 0) {
			throw new NumberFormatException("All the values must be positive");
		}
		return value;
	}

	// volume for Cube/hình lập phương
	int get_volume(int a) {
		return (int) Math.pow(a, 3);
	}

	// volume for Cuboid/hình hộp chữ nhật
	int get_volume(int l, int b, int h) {
		return l * b * h;
	}

	// volume for Hemisphere/hình bán cần
	double get_volume(double r) {
		return 2 * Math.PI * Math.pow(r, 3) / 3;
	}

	// volume for Cylinder/hình lăng trụ
	double get_volume(double r, double h) {
		return Math.PI * Math.pow(r, 2) * h;
	}

	// display volume
	void display(double volume) {
		System.out.printf("volume: %.3f", volume);
		System.out.println();
	}

	// return a Calculate object
	public static Calculate do_calc() {
		if (output == null) {
			output = new Calculate();
		}
		return output;
	}

}
