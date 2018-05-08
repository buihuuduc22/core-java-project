package lab_10_20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexp {
	public static void main(String[] args) {
		String str= "duc@funix.edu.vn";
//		String pttString = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
		String pttString = "^[a-zA-Z0-9_.-]+@+[a-z0-9.-]+\\.+[a-z]{2,6}$";
		Pattern ptt = Pattern.compile(pttString, Pattern.CASE_INSENSITIVE);
		Matcher mat = ptt.matcher(str);
		System.out.println(mat.matches());
		
	}
}
