package assesment2;

public class constructor {
	double width,height,depth,result;
	public constructor()
	{
		width=10;
		height=10;
		depth=10;
		result=width*height*depth;
		System.out.println("The volume without parameter : "+result);
	}
	public constructor (double w,double h,double d,double result1)
	{
		result1=w*h*d;
		width=w;
	
		height=h;
		depth=d;
		result=result1;
		
		
		
	}
	void display()
	{
		System.out.println("The volume with parameter : "+result);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor s=new constructor();
		s.display();
		

	}

}
