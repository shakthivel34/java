package oops;
class base{
	int emp_id;
	String empname;
	void getinfo(int id,String name) {
		emp_id=id;
		empname=name;
	}
	void putinfo() {
		System.out.println("Employee ID: "+emp_id);
		System.out.println("Employee name: "+empname);
		}
}
class derived extends base{
	String designation;
	int salary;
	void getinfo1(String desig,int sal) {
		designation=desig;
		salary=sal;
		getinfo(123,"shakthi");
		}
	void putinfo1() {
		putinfo();
		System.out.println("Designation : "+designation);
		System.out.println("Salary: "+salary);
	
}
}

public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived d=new derived();
		d.getinfo1("HR", 20000);
		d.putinfo1();

	}

}

