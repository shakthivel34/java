package assessment3;
import java.util.*;

public class secondlargestandsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("Second largest number: ");
		for (int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if (ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			
		}
		System.out.print(ar[n-1]);
		System.out.println();
		System.out.print("Smallest number: ");
		System.out.print(ar[1]);
		
		

	}

}
