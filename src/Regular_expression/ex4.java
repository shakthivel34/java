package Regular_expression;
import java.util.*;
import java.util.regex.Pattern;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true because 6 char are ther
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarunarun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arunss"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
		

	}

}
