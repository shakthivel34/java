package numbertypes;
import java.util.*;
public class petersonnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=s.nextInt(),num1,fact,num2,add=0,result=0;
		String str1=String.valueOf(num);
		num1=str1.length();
		int temp=num;
		
		for (int i=num1;i>0;i--) {
			num2=num%10;
			num=num/10;
			fact=1;
			//System.out.println("The factorial is : "+num2);
			for (int j=1;j<=num2;j++)
			{
				fact=fact*j; //
				result=fact;	//assigning new value result to change fact	
				//System.out.println("factorial :"+fact);		
			}
			
			add=result+add;		//to add factorial numbers
			//System.out.println("final :"+add);			//
		}
		if (temp==add) {
			System.out.println("PetersonNumber");
		}
		else {
			System.out.println(" Not a PetersonNumber");
			
		}

		
		
		
		
		
		
		
		
		
			
		}
		
		
		

	}


