package oops;
class parents 
{
	void show()
	{
	 System.out.println("The parents class");
	}
}
class son1 extends parents
{
	void show1()
	{
	 System.out.println("The son class");
	}
}
class daughter extends parents
{
	void show2()
	{
	 System.out.println("The Daughter class");
	}
}

public class hieararchialinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son1 s=new son1();
		daughter d=new daughter();
		s.show1();
		s.show();
		d.show2();
		

	}

}
