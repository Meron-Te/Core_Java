package ThreadAss;

import ThreadDemo.BankAccount;

public class ThreadDep {
	BankAccount bankobj;
	public ThreadDep(BankAccount bankobj)
	{
		this.bankobj=bankobj;
	}
	public ThreadDep(ThreadAss.BankAccount bank) {
		// TODO Auto-generated constructor stub
	}
	public void run()
	{
		bankobj.deposit(2000);
	}
	



}
