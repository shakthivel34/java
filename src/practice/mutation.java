package practice;
import java.util.*;

public class mutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the array elements one bye one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("Before Mutation: ");
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("After Mutation: ");
		for (int i=0;i<1;i++)
		{
			if (ar[i]==0)
			{
				ar[i]= ar[i+1];
			}
		}
		for (int i=1;i<n-1;i++)
		{
			if (ar[i]==0)
			{
				ar[i]=ar[i-1]+ar[i+1];
			}
		}
		
		
		for (int i=n-1;i<n;i++)
		{
			if (ar[i]==0)
			{
				ar[i]= ar[i-1];
			}
		}
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		
		}
		

	}


