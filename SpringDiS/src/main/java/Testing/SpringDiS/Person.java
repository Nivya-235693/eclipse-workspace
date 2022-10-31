package Testing.SpringDiS;

public class Person {
	
	private String name;
	private String department;
	
	public Person(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void display () {
		System.out.println("myself is "+ name+ " " + "from "+ department);
	}
	

}
