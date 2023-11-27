package mutate_array;
import java.util.*;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;int add; int zero=0;
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
		System.out.print("After Mutation" );
		for (int i=0;i<n;i++)
		{
			if( i==0&&ar[0]==0)
			{
			  ar[0]=ar[1];
			}
			else if (i==n-1&&ar[n-1]==0)
			{
				ar[n-1]=ar[n-2];
			}
			else if(ar[i]==0)
			{
				ar[i]=ar[i-1]+ar[i+1];
			}
		}
		
		
			
		for (int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		

	}

}
