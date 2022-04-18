package ThreadAss;

import ThreadDemo.BankAccount;

public class ThreadWith extends Thread{
	BankAccount bankobj;
	public ThreadWith(BankAccount bankobj)
	{
		this.bankobj=bankobj;
	}
	public void run()
	{
		bankobj.withdraw(20000);
	}

}

	


