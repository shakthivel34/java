package practice;
import java.util.*;

public class CLONE_ARRAY {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=s.nextInt();
		int ar[]=new int [n];
		System.out.println("Enter the elements one by one: ");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("Before Duplication: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ar[i]);
		}
		
		for (int i=0;i<n;i++)
		{
			
			for (int j=i+1;j<n;j++)
			{
				if (ar[i]==ar[j])
				{
					
					count++;
					;
				}
				if (count==1)
				{
					ar[i]=ar[n-count];
					System.out.print(ar[n-1]);
				}
				
				
			}
		}
		
		System.out.println();
		System.out.print("After duplication: " );
	//	for(int i=0;i<n;i++)
		//{
		//	System.out.print(ar[i]);
		//}
		
		
		
		

	}

}
