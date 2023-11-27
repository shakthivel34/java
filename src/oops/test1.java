package oops;
class student {
	int rollno;
	String name;
	float fee;
	student(int rollno,String name,float fee) { //variable and parameter is same
		this.rollno=rollno; //use this. to solve the error 
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
		}
	
}


public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student(111,"Shakthi",5000f);
		student s2=new student(112,"Suci",6000f);
		s1.display();
		s2.display();
		//result will be 0 because variable and parameters are same
		//result will be correct by using this.

	}

}
