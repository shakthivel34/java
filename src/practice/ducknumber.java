package practice;
import java.util.*;

public class ducknumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int count=0,n1=0;
		int n2=0;
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		String str=Integer.toString(n);
		int len=str.length();
		//System.out.println(len);
		
		for(int i=len;i>0;i--)
		{
			 n1=n%10;
			n=n/10;
			
			if (n1==0)
			{
				n2++;
			}
			
		}
				
		if (n2>0)
		{
			System.out.println("Duck number");
		}
		else if(n1!=0)
		{
			System.out.println("Not a Duck number");
		}
		else 
		{
			System.out.println("Not a Duck number");
		}
		
		
		
			
		
			
			
		
		
		
		
		
		

	}

}
