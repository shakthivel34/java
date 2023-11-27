package assessment3;
import java.util.*;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the elements one by one: ");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.print("Elements before Sorting: ");
		for (int i=0;i<n;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("After Sorting: ");
		for (int step=1;step<n;step++)
		{
			int key=step;
			for (int i=step-1;i>=0;i++)
			{
				if (ar[step]>ar[i])
				{
					int temp=ar[step];
					ar[step]=ar[i];
					ar[i]=temp;
					key--;
				}
			}
		}
		for (int i=0;i<n;i++)
		{
			System.out.println(ar[i]+" ");
		}
		

	}

}
