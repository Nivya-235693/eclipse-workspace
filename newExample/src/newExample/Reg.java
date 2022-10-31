package newExample;

public class Reg {

	public static void main(String[] args) {
		Car a = new Audi();
		Car b = new Toyota();
		
		a.speed();
		a.mileage();
		
		b.speed();
		b.mileage();
	}
}
