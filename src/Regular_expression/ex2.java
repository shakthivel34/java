package Regular_expression;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(".s"); //1st way .s means;; ending should be s and before s only one character;
		// ..s means; before s two character; number of dots =number of characters.
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		
		boolean b2=Pattern.compile(".s").matcher("aas").matches();// 2nd ways
		
		boolean b3=Pattern.matches(".s", "as"); // 3rd way
		
		System.out.println(b+" "+b2+" "+b3);
		
		
		

	}

}
