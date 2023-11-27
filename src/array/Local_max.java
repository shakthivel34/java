package array;
import java.util.*;

public class Local_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int flag=1;
		System.out.println("Enter the size of the array: ");
		int n=s.nextInt();
		int ar[]=new int[n+1];
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for (int i=1;i<n;i++)
		{
			if ( ar[0]>ar[1]&&ar[0]>ar[n-1])
			{
				flag=ar[0];
				
			}
			if (ar[i]>ar[i-1]&&ar[i]>ar[i+1])
			{
				flag=ar[i];
				
			}
			 if (ar[n-1]>ar[n-2]&&ar[n-1]>ar[0])
			{
				flag=ar[n-1];
			
			}
		}
		System.out.print(flag);

	}

}
