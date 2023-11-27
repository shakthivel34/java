package array;
import java.util.*;

public class lowertriangularmatrix {

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
			for(int i=0;i<r;i++)
			{
				for(int j=i+1;j<c;j++)
				{
					
				}
			}

	}

}
}
