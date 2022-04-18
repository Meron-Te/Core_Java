package ThreadDemo;

public class AccountThread2 extends Thread{
	BankAccount bankobj;
	public AccountThread2(BankAccount bankobj)
	{
		this.bankobj=bankobj;
	}
	public void run()
	{
		bankobj.deposit(40000);
	}

}
