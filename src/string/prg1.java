package string;

public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer();
		StringBuffer s2=new StringBuffer(20);
		StringBuffer s3=new StringBuffer("Welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.append("sd ff a aFA fasfdsfdghcfdhcv8035");
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		s1.setLength(5);
		System.out.println(s1.length());
		System.out.println(s1.capacity());
		System.out.println(s1);
		System.out.print(s1.reverse());
		
		
		
		
		

	}

}
