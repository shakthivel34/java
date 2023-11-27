package oops;
class encap 
{
	private int ssn;
	private String empname;
	private int empage;
	public int getempssn()
	{
		return ssn;
	}
	public String getempname()
	{
		return empname;
	}
	public int getempage()
	{
		return empage;
	}
	public void setempage(int newvalue)
	{
		empage=newvalue;
	}
	public void setempname(String newvalue)
	{
		empname=newvalue;
	}
	public void setempssn(int newvalue)
	{
		ssn=newvalue;
	}
	
}

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encap e=new encap();
		e.setempname("shakthi");
		e.setempage(21);
		e.setempssn(1122);
		System.out.println("Employee name: "+e.getempname());
		System.out.println("Employee SSN: "+e.getempssn());
		System.out.println("Employee Age: "+e.getempage());
		
		
		

	}

}
