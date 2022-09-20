package recap;

class student{
	int rollno;
	String name;
	static String college="BBDIT";
	static void change() {
		college="IIT";
	}
	student(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class stati {

	public static void main(String[] args) {
		student.change();
		student S1=new student(11,"Anu");
		student S2=new student(12,"Nishadh");
		S1.display();
		S2.display();
	}
}
