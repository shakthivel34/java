package Regular_expression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class case_insensitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern=Pattern.compile("JavatRaininG",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("Welcome JavaTraining");
		boolean matchfound=matcher.find();
		if(matchfound)
		{
			System.out.println("Match found");
		}
		else
		{
			System.out.println("Match Not found");
		}

	}

}
