package recap2;
class a{
	int n;
}
public class compare {

	public static void main(String[] args) {
		Long a= new Long(5677);
		Double b= new Double(5677);
		System.out.println(a.equals(b));
		a A= new a();
		A.n=10;
		a B= new a();
		B.n=10;
		System.out.println(A.equals(A));
	}
}
