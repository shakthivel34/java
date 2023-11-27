package practice;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		int sum=0;
		
		for ( int i=1;i<=n;i++)
		{
			fact=i*fact;
			for (int j=1;j<=n;j++)
			{
				sum=1/fact;
			}
		}
		for (int i=1;i<=n;i++)
		{
			System.out.print(sum);
		}
		
		

	}

}
