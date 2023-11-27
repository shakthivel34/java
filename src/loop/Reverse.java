package loop;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num,remainder,result;
		num=s.nextInt();
		result=0;
		while (num!=0) {
			remainder=num%10;
			result=result*10+remainder;
			num=num/10;
			
		}
		System.out.print(result);

	}

}
