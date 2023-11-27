package practice;
import java.util.*;

public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int div,mod,count=0;
		while (n>0)
		{
			div=n/2;
			mod=n%2;
			n=div;
			if (mod==1)
			{
				count++;
			}
		}
		System.out.print(count);

	}

}
