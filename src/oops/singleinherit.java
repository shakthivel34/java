package oops;
class person1 {
	String name;
	int age;
	void getperinfo(String str,int ag) 
	{
		name=str;
		age=ag;
	}
	void putperinfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class student2 extends person1 {
	int total;
	char grade;
	void getstuinfo(String n,int ag,int tot,char gr) 
	{
		getperinfo(n,ag);
		total=tot;
		grade=gr;
	}
	void putstuinfo()
	{
		 putperinfo();
		System.out.println("Total: "+total);
		System.out.println("Grade: "+grade);
	}
	}

public class singleinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student2 s=new student2 ();
		s.getstuinfo("Honey",21,98,'s');
		s.putstuinfo();

	}

}
