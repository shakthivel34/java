package sumofdigits;
import java.util.*;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,sum=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				b=Integer.parseInt(String.valueOf(str.charAt(i)));
				sum=sum+b;
			}
		}
		System.out.println(sum);

	}

}
