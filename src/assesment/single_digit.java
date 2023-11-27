package assesment;
import java.util.*;

public class single_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long num,num1,digit,add=0;
		long digit1;
		long num3,num4,result=0;
		String str,str1;
		
		System.out.println("Enter the Number : ");
		num=s.nextLong();
		str=String.valueOf(num);
		digit=str.length();
		
		for (long i=digit;i>0;i--)
		{
		  num1=num%10;
		  num=num/10;
		  add=num1+add;
		  }
		  str1=String.valueOf(add);
		  digit1=str1.length();
		  for(long j=digit1;j>0;j--)
		  {
			  num3=add%10;
			  add=add/10;
			  result=num3+result;
		  }
		  System.out.print("Answer: "+result);
		  
		
			  
			  
		  
			
		}
		

		

	
}


