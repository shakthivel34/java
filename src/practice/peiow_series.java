package practice;
import java.util.*;

public class peiow_series {
	void fibonacci(int n)
	{
		int a=0;
		int b=1;
		int c;
		int count=0;
	    System.out.print(b+" ");
	    for (int i=1;i<n;i++)
	    {
	    	c=a+b;
	    	System.out.print(c+" ");
	    	a=b;
	    	b=c;
	    }
		}
	
	void primenum(int n)
	{
		int count =0;
		for (int i=2;i<n;i++)
		{
			count=0;
			for (int j=1;j<=i;j++)
			{
				count++;
			}
			if (count==2)
			{
				System.out.println();
				System.out.println(i);
			}
		}
		
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		peiow_series ps=new peiow_series();
		ps.fibonacci(n);
		ps.primenum(n);

	}

	}
