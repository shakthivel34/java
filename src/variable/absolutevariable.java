package variable;

public class absolutevariable {
	int first=4,second=8;
	public void add() {
		System.out.println("Enter the Number:"+(first+second));
	}
	public void diff() {
		System.out.println("Enter the Number:"+Math.abs(first-second));//Math.abs used to neglect negative value.
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		absolutevariable av=new absolutevariable();
		av.add();
		av.diff();

	}

}
