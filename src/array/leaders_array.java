package array;
import java.util.*;

public class leaders_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int lead;
		System.out.println("Enter the number of arrays: ");
		int n=s.nextInt();
		int ar[]=new int[n+1];
		System.out.println("Enter the array elements one bye one: ");
		
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for (int i=0;i<n-1;i++)
		{
		  for (int j=n-2;j>=0;j--)
		  {
			  if (ar[i]>ar[j])
			  {
				  System.out.print(ar[i]);
			  }
		   }
		}
		
		System.out.print(ar[n-1]);

	}

}
