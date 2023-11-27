package oops;
class person {
	public void role() {
		int a=5;
		int b=6;
		int add=a+b;
		System.out.println(add);
		System.out.println("son/daughter");
	}
}
public class overriding extends person {
	public void role () {
		//super.role();
		//System.out.println("Student");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding or=new overriding();
		or.role();

	}

}
