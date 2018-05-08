/*@Java Static Initializer Block
 * use static block to get input breadth and height
 * and then calculate and print area of rectangle
 * */
package lab_1_9;

import java.util.Scanner;

public class Challenge_7_JavaStaticInitializerBlock {

	static int B;
	static int H;
	static boolean flag;
	//static block
	static {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		flag = true;
		if (B <= 0 || H <= 0) {
			System.out
					.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}
		sc.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}
	}

}
