package practice;
import java.util.*;

public class fact_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		
		int r;
		int result;
		int sum=0;
		while(n!=0)
		{
		  int fact=1;
		  r=n%10;
		  for (int i=r;i>0;i--)
		  {
			  fact=fact*i;
			  
			  
		  }
		  sum=sum+fact;
		  n=n/10;
		 }
		
		System.out.println("THe factorial is: "+sum);
		
	}

}
