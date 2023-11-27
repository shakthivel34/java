package string;
class data{ // class
	int studId=101;
	String studname="Shakthi";
	void display() { //method
		System.out.println("StudentId is : "+studId);
		System.out.println("Student name is : "+studname);
		
	}
}
public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		data d=new data(); // creating data d to caLL CLASS D
		d.display(); 
		// calling method to print

	}

}
