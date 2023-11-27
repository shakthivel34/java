package practice;
import java.util.*;
public class arraysecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int max;
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the values one by one elements: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("The values Stored: ");
		for (int i=0;i<n;i++)
		{
			System.out.println(ar[i]+" ");
		}
		for (int i=0;i<n-1;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				if (ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					
				}
			}
		}
		System.out.print("Sorted: ");
		for (int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("Second largest number: "+ar[n-2]);
		
		
		
		


}
}
