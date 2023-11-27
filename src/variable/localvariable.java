package variable;

public class localvariable {
	int a; //global variable
	public void display() {
		a=10; //local variable
		int b=50;
		System.out.println(a);
		System.out.println(b);
	}
	public void display2() {
		//a=20;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localvariable lv=new localvariable();
		lv.display();
		lv.display2();

	}

}
