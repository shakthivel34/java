package practice;
import java.util.*;

public class palindrome_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENter the sentence:");
		String str=s.nextLine();
		String letter=str.toLowerCase();
		StringBuffer a=new StringBuffer(letter);
		a.reverse();
		String reverse=a.toString();
		if(letter==null)
		{
			System.out.println("Text is not entered");
		}
		else if (letter.equals(reverse))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		

	}

}
