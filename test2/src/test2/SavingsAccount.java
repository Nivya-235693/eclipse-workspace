package test2;

public class SavingsAccount extends Account{
    
    public SavingsAccount(int accountNumber, Customer customerObj, double balance,double minimumBalance) {
        super(accountNumber, customerObj, balance);
        this.minimumBalance=minimumBalance;
        
    }
   private double minimumBalance;
   public double getMinimumBalance() {
        return minimumBalance;
    }
   public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
   public static void main(String[] args) {
   }
    @Override
    public boolean withdraw(double amount) {
        if(balance-amount>minimumBalance) {
            balance=balance-amount;
            return true;   
        }
        else
            return false;
    }
}
