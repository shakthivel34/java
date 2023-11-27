package sorting;
import java.util.*;


public class insertion_classobj {
	static void insertionsort(int ar[],int n)
	{
		for (int step=1;step<n;step++)
		{
			int key=step;
			for (int j=step-1;j>=0;j--)
			{
			  if(ar[j]>ar[key])
			  {
				 int temp=ar[j];
				 ar[j]=ar[key];
				 ar[key]=temp;
				 key--;
			  }
			}
			
		}
	}
	static void print(int ar[],int n)
	{
		System.out.println();
		System.out.println("After sorting ");
		for (int j=0;j<n;j++)
		{
			System.out.print(ar[j]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the values: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Before Sorting");
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		insertionsort(ar,n);
		print(ar,n);
		s.close();
		
		

	}

}
