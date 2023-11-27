package Control_flow;
import java.util.*;
public class average1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String studentid,name;
		int mark1,mark2,mark3,total;
		float Average;
		System.out.print("Enter the student id:");
		studentid=s.next();
		System.out.print("Enter the student Name:");
		name=s.next();
		System.out.print("Enter the mark1:");
		mark1=s.nextInt();
		System.out.print("Enter the mark2:");
		mark2=s.nextInt();
		System.out.print("Enter the mark3:");
		mark3=s.nextInt();
		total=mark1+mark2+mark3;
		System.out.println("The total:"+total);
		Average=total/3;
		System.out.println("The average:"+Average);
		if (Average>90) {
			System.out.print("excellent");
		}
		else if (Average>80&&Average<90) {
			System.out.print("very good");
			
		}
		else if (Average>70&&Average<80) {
			System.out.print("good");
			
		}
		else if (Average>60&&Average<70) {
			System.out.print("work hard ");
			
		}
		else {
			System.out.print("poor");
			
		}
		
		
		
		
		
		

	}

}
