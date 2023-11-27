package array;

import java.util.Scanner;

public class ascendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of arrays: ");
		int n=s.nextInt();
		int ar[]=new int[n+1];
		System.out.println("Enter the array elements one bye one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("Before Ascending order: ");
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("After Ascending: ");
		for (int i=0;i<n;i++)
		{
		
				if (ar[i]>ar[i+1])
				{
					int temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
					
				}
			}
				
		
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}

}
