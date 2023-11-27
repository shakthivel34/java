package oops;
class grand_father
{
	void show1() 
	{
		System.out.println("i show function in grandfathers class");
	}
}
class father extends grand_father
{
	void show2() 
	{
		System.out.println("i show function in father class");
	}
}
class son extends father
{
  void show3() 
	{
		System.out.println("i show function in son class");
	}
}
class grandson extends son
{
	void show4() 
	{
		System.out.println("i show function in grandson class");
	}
}



public class multiinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grandson gs=new grandson();
		gs.show1();
		gs.show2();
		gs.show4();
		gs.show3();
		

	}

}
