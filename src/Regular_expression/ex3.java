package Regular_expression;
import java.util.regex.*;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("metacharacters d...");
		
		System.out.println(Pattern.matches("\\d","abc"));
		System.out.println(Pattern.matches("\\d","1"));
		System.out.println(Pattern.matches("\\d","4443"));
		System.out.println(Pattern.matches("\\d","323abc"));
		
		System.out.println("metacharcters D....");
		System.out.println(Pattern.matches("\\D","abc"));
		System.out.println(Pattern.matches("\\D","abc"));
		System.out.println(Pattern.matches("\\D","1"));
		System.out.println(Pattern.matches("\\D","4443"));
		System.out.println(Pattern.matches("\\D","323abc"));
		System.out.println(Pattern.matches("\\D","m"));
		
		System.out.println("metacharcters D with quantifier....");
		System.out.println(Pattern.matches("\\D*", "maaa"));
		
		 

	}

}
