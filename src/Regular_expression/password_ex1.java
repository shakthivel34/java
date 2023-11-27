package Regular_expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class password_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line="This order was placed for QT3000! OK?";
		Pattern p=Pattern.compile("(.*?)(\\d+)(.*)");
		Matcher m=p.matcher(line); // matcher inbuild function
		while (m.find())
		{
			System.out.println("Group 1: "+m.group(1));
			System.out.println("Group 2: "+m.group(2));
			System.out.println("Group 3: "+m.group(3));
			
		}
		
		
		

	}

}
