package sorting;
import java.util.*;

public class bubblesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=s.nextInt();
		int ar[]=new int[num];
		System.out.println("Enter the values: ");
		for (int i=0;i<num;i++)
		{
			ar[i]=s.nextInt();
		}
		System.out.println("Before sorting: ");
		for (int i=0;i<num;i++)
		{
			System.out.print(ar[i]+" ");
		}
		for (int step=0;step<num-1;step++)
		{
			for (int i=0;i<num-step-1;i++)
			{
				if (ar[i]>ar[i+1])
				{
					temp=ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
					
				}
				
			}
		}
		System.out.println();
		System.out.println("After Sorting: ");
		for (int i=0;i<num;i++)
		{
			
			System.out.print(ar[i]+" ");
		}
		

	}

}
