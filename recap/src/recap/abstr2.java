package recap;
abstract class Parent 
{
	public abstract void message();
}
class Subs extends Parent{

	@Override
	public void message() {
		System.out.println("This is first subclass");
	}	
}

class Sub extends Parent{

	@Override
	public void message() {
		System.out.println("This is Second subclass");
	}	
}
		
public class abstr2 {
	public static void main(String[] args) {
		Parent p=new Subs();
		Parent pp=new Sub();
		p.message();
		pp.message();
	}
}
