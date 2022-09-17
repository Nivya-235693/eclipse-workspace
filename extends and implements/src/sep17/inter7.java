package sep17;
interface showables{
	void show();
	interface message{
		void msg();
	}
}
class inter7 implements showables.message{
	public void msg() {
		System.out.println("Hello nested interface");
	}
	public static void main(String[] args) {
		showables.message message=new inter7();
		message.msg();
	}
}
