package variable;

public class Constructor {
	int stud_id;
	String studname,studcollege;
	public Constructor() { // Normal Constructor
		stud_id=101;
		studname="Shakthi";
		studcollege="Abc college";
		System.out.println(stud_id);
		System.out.println(studname);
		System.out.println(studcollege);
		}
	public Constructor(int id,String name,String col) { //PARAMETERIZED Constructor
		System.out .println(id);
		System.out .println(name);
		System.out .println(col);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
		Constructor c1=new Constructor (102,"Ganga","Merit");

	}

}
