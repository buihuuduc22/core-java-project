/*@Java Date and Time
 * get day of the week by input specific date
 * */
package lab_1_9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Challenge_9_JavaDateAndTime {
	//get day of week from date
	public static String getDay(String date) throws ParseException {
		Date d = new SimpleDateFormat("dd M yyyy").parse(date);
		//EE meaning day of week short version
		String dayOfWeek = new SimpleDateFormat("EE").format(d);
		return dayOfWeek;
	}

	public static void main(String[] args) throws ParseException {
		Scanner in = new Scanner(System.in);
		System.out.print("input date: ");
		//input date with format "dd M yyyy"
		String date = in.nextLine();
		in.close();
		System.out.println(getDay(date));
	}

}
