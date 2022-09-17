package sep17;
interface bank{
	float rateofinterest();
}
class SBI implements bank{
	public float rateofinterest() {
		return 9.15f;
	}
}
class PNB implements bank{
	public float rateofinterest() {
		return 9.7f;
	}
}
public class inter3 {

	public static void main(String[] args) {
		bank b=new SBI();
		System.out.println("ROI: "+b.rateofinterest());
	}
}
