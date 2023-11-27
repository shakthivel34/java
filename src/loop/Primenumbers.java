package loop;
import java.util.*;
public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,notprime=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		num=s.nextInt();
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				notprime=2;
				break;
				
			}
			
		}
		if(notprime==2) {
			System.out.print("Not a prime number");}
		else {
			System.out.println("prime number");}
		
				
		

	}

}
