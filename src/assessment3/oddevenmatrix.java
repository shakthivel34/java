package assessment3;
import java.util.*;

public class oddevenmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int flag=0,count=0;
		System.out.println("Enter the number of rows: ");
		int r=s.nextInt();
		System.out.println("Enter the number of colums: ");
		int c=s.nextInt();
		int ar[][]=new int[r][c];
		if (r==c)
		{
			for (int i=0;i<r;i++)
			{
				for (int j=0;j<c;j++)
				{
					ar[i][j]=s.nextInt();
					if (ar[i][j]%2==0)
					{
						flag++;
					}
					if (ar[i][j]%2!=0)
					{
						count++;
					}
				}
				
			}
			System.out.println("Even number frequency:"+flag);
			System.out.println("odd number frequency:"+count);
			}
		else {
			System.out.println("Invalid Input");
		}
		}
	}
