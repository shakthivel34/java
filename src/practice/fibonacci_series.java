package practice;
import java.util.*;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for (int i=1;i<n;i++)
		{
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
		
			
		}
	

	}


