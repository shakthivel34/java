package array;
import java.util.*;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,max,min;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Elements: ");
		n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the numbers one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Array elements Stored: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		
		max=ar[0];
		// storing index value 0 in max
		for (int i=1;i<n;i++) // starting from 1 because 0 is stored in max
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
			
		}
		min=ar[0];
		for (int i=1;i<n;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println("The maximum element is : "+max);
		System.out.println("The minimum number is: "+min);
		

	}

}
