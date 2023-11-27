package assesment;
import java.util.*;
public class amstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit,num,remainder,result=0,temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		num=s.nextInt();
		digit=0;
		temp=num;
		while (num!=0) {
			digit++;
			num=num/10;
			
		}
		num=temp;
		while(num!=0) {
			remainder=num%10;
			result=(int) (result+Math.pow(remainder,digit));
			num=num/10;
		}
		if(temp==result) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println(" Not Amstrong Number");
			
		}
		

	}

}
