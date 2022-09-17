package sep17;
interface Print1
{
	void print();
}
interface showable{
	void print();
}
class inter4 implements Print1,showable {
	public void print() {
		System.out.println("helloooo");
	}
	public static void main(String[] args) {
		inter4 obj=new inter4();
		obj.print();
	}
}
