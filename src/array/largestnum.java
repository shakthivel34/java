package array;
import java.util.*;

public class largestnum {

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
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		//for (int i=0;i<n;i++)
		//{
			//System.out.print(ar[i]);
		//}
		System.out.print(ar[0]);

	}

}
