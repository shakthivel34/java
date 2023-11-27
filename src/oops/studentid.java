package oops;
class base1 {
	int stud_id;
	String studname;
	void getinfo(int id,String name) {
		stud_id=id;
		studname=name;
	}
	void putinfo() {
		System.out.println("Student ID: "+stud_id);
		System.out.println("Student name: "+studname);
		}
}
	class derived1 extends base1 {
		int m1,m2,m3,total;
		float average;
		void getinfo1(int mark1,int mark2,int mark3) {
			m1=mark1;
			m2=mark2;
			m3=mark3;
			total=m1+m2+m3;
			average=total/3;
			}
	
		void putinfo1() {
			
			
			System.out.println("Total : "+total);
			System.out.println("Average : "+average);
			} 
		} 
	public class studentid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		derived1 d=new derived1();
		d.getinfo(101,"Shakthi");
		d.putinfo();
		d.getinfo1(50, 50, 50);
		d.putinfo1();
		
		
		

	}

}
