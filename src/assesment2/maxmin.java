package assesment2;
import java.util.*;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the lements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Array elements Stored:  ");
		for (int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		int max,min;
		max=ar[0];
		for (int i=1;i<n;i++)
		{
			if (ar[i]>max)
			{
				max=ar[i];
			}
		}
		min=ar[0];
		for (int i=1;i<n;i++)
		{
			if (ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println("The maximum number is: "+max);
		System.out.println("The mimimum number is: "+min);
		
		
		
		
		

	}

}
