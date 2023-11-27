package assessment3;
import java.util.*;

public class strictlyincreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the size of the array: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (ar[i]<ar[j])
				{
					flag=1;
					
				}
			}
		}
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (ar[i]>=ar[j])
				{
					flag=2;
					
				}
			}
		}
		if (flag==1)
		{
			System.out.println("Array is strictly Increasing");
		}
		if (flag==2)
		{
			System.out.println("Array is not strictly Increasing");
		}
		
	}

}
