package sep17;
interface Print3{
	void print();
}
interface showa extends Print3{
	void show();
}
class inter5 implements showa{
	public void print() {
		System.out.println("hello");
	}
	public void show() {
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		inter5 obj = new inter5();
		obj.print();
		obj.show();
	}
}
