package oops;
abstract class sum
{
	public abstract int sumoftwo(int n1,int n2);
	public abstract int sumofthree(int n1,int n2,int n3);
	public void disp()
	{
		System.out.println("Method of class sum");
	}
	
}
class demo extends sum
{
	public int sumoftwo(int num1,int num2)
	{
		return num1+num2;
	}
	public int sumofthree(int num1,int num2,int num3)
	{
		return num1+num2+num3;
	}
	
}
public class abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum s=new demo();
		System.out.println(s.sumoftwo(3, 7));
		System.out.println(s.sumofthree(3, 7,19));
		s.disp();
		

	}

}
