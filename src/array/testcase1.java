package array;
import java.util.*;
public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		//int array1[]= {1,2,7};
		int[] array= new int[num];
		
		for (int i=0;i<num;i++) 
		{
			array[i]=s.nextInt();
			
			}
			System.out.println("Entered the number to get searched: ");
			int src=s.nextInt();
			
			for(int i=0;i<num;i++)
			{
				if(src==array[i])
				{
					flag=1;
					break;
				}
				
				else
				{
					flag=2;
				}
			}
			
			if(flag==1)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		
	}
		
		

	}


