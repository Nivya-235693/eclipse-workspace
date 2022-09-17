package sep17;
interface FuncInterface{
	void abstractFun(int x);
}
public class test {

	public static void main(String[] args) {
		FuncInterface fobj= (int x)->System.out.println(2*x);
		fobj.abstractFun(5);
	}
}
