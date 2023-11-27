package oops;
interface base3
{
	public void fun1();
}
interface base2
{
	public void fun2();
}
class interimple implements base3,base2
{
	public void fun2()
	{
		System.out.println("Fun2");
	}
	public void fun1()
	{
		System.out.println("Fun1");
	}
	
}

public class mainclassinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interimple ip=new interimple();
		ip.fun1();

	}

}
