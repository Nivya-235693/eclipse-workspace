package inheritence;

abstract class parent{
	public abstract void message();	
}
 class S extends parent{
	public void message() {
		System.out.println("this is first subclass");
	}
}
class Su extends parent{
	public void message() {
		System.out.println("this is second subclass");
	}
}
public class parentmsg {
	public static void main(String[] args) {
		parent cc=new Su();
		parent dd=new S();
		dd.message();
		cc.message();
	}
}