package ThreadDemo;

public class BankAccount {
		double balance=20000;
		boolean choice=true;
		public synchronized void withdraw(double amount)
		{
			if(balance<amount)
			{
				System.out.println("Insufficient balance");
				try {
					wait();
					System.out.println("Waiting so that another thread put some amount there");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			balance=balance-amount;
			
			System.out.println("Updated balance is "+balance);
			choice=false;
			}
		public synchronized void deposit(double amount)
		{
			balance=balance+amount;
			if(balance>amount)
			{
				notify();
		}

		}
}


