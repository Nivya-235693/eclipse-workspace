package recap;
class Bank{
	int getBalance()
	{
		return 0;
	}
}

class BankA extends Bank
{
	int getBalance()
	{
		System.out.println("Balance in bank A is $100");
		return 0;
	}
}

class BankB extends Bank
{
	int getBalance()
	{
		System.out.println("Balance in Bank B is $150");
		return 0;
	}
}

class BankC extends Bank
{
	int getBalance()
	{
		System.out.println("Blance in Bnak C is $200");
		return 0;
	}
}

public class abstr3 {

	public static void main(String[] args) {
		Bank b=new Bank();
		BankA ba=new BankA();
		BankB bb=new BankB();
		BankC bc=new BankC();
		b.getBalance();
		ba.getBalance();
		bb.getBalance();
		bc.getBalance();
	}

}

