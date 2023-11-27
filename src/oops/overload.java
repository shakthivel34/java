package oops;
class overload1
{
	void demo (int a) {
		System.out.println("a: "+a);
		}
	void demo (int a,int b) {
		System.out.println("a and b: "+a+","+b);
		}
	double demo (double a) {
		System.out.println("double a: "+a);
		return a*a;
		
	}

}

public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload1 ol=new overload1();
		double result;
		ol.demo(10);
		ol.demo(10,20);
		result=ol.demo(5.5);
		System.out.println("0/P: "+result);
		

	}

}
