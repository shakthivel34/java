package array;
import java.util.*;

public class uppertrianglematrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int r=s.nextInt();
		System.out.println("Enter the number of column: ");
		int c=s.nextInt();
		int ar[][]=new int[r][c];
		System.out.println("Enter the values: ");
		if (r==c)
		{
			for (int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					ar[i][j]=s.nextInt();
				}
			}
			for (int i=1;i<r;i++)
			{
				for (int j=0;j<i;j++)
				{
					if (ar[i][j]!=0)
					{
						flag=1;
					}
					
				}
			}
			if (flag==0)
			{
				System.out.println("Upper Triangular matrix");
			}
			else
			{
				System.out.println("Not a Upper Triangular matrix");
			}
		}
		else
		{
			System.out.println("Invalid input");
		}
		

	}

}
