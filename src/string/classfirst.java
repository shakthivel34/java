package string;

public class classfirst {
	int num1=10,num2=20,result;//state or attributes
	

	void add() {  //behaviour or function or action
		
		result=num1+num2;
		System.out.println(result);
	}
	void sub() { //action=sub
		System.out.print(num2-num1);
	}
	void multiply () {
		System.out.println(num1*num2);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classfirst f=new classfirst(); //used to call the classfirst
		f.multiply();
		;// to call action

	}

}