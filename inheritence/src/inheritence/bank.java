package inheritence;
import inheritence.bank;
import inheritence.banka;
import inheritence.bankb;
import inheritence.bankc;

class bank1{
	void getbalance() {
		System.out.println(0);
	}
}
class banka extends bank1{
	void getbalance() {
		System.out.println("balance in bank A is 100");
	}
}
class bankb extends bank1{
	void getbalance() {
		System.out.println("balance in bank B is 150");
	}
}
class bankc extends bank1{
	void getbalance() {
		System.out.println("balance in bank C is 200");
	}
}
public class bank {

	public static void main(String[] args) {
		banka ba=new banka();
		bankb bb=new bankb();
		bankc bc=new bankc();
		ba.getbalance();
		bb.getbalance();
		bc.getbalance();
	}
}