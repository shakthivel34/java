package string;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=s.nextLine();
		String letter =str.toLowerCase();
		StringBuffer a=new StringBuffer(letter);
		a.reverse();
		String buff1=a.toString();
		if(letter.equals(buff1))
		{
			System.out.print("palindrome");
		}
		else
		{
			System.out.print("NOt palindrome");
		}
		
}
}
