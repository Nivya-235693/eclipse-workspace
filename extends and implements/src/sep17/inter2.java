package sep17;
interface show{
	void sho();
	static int printa(int s) {
		return s*s;
	}
}
class printa implements show{
	public void sho() {
		System.out.println("Helloooo");
	}
}
public class inter2 {
	public static void main(String[] args) {
		printa s = new printa();
		s.sho();
		System.out.println(show.printa(3));
	}
}
