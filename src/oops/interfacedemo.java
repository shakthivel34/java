package oops;
interface myinterface
{
	public void method1();
	public void method2();
}
class demo1 implements myinterface
{
	public void method1()
	{
		System.out.println("Implementation of method 1");
	}
	public void method2()
	{
		System.out.println("Implementation of method 2");
	}
}

public class interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myinterface mi=new demo1();
		mi.method1();
		

	}

}
