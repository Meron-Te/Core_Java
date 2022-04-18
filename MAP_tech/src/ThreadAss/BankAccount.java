package ThreadAss;

public class BankAccount {
	double balance=60000;
	
	public synchronized void withdraw(double amount) {
		if(balance<amount)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
		balance=balance-amount;
		System.out.println("Updated balance is "+balance);
		}
	}
    public synchronized void deposit (double amount) {
		
		System.out.println("Deposit balance");
		balance=balance+amount;
		}
		
}


