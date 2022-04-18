package ThreadAss;

public class ThreadMain {
	public static void main(String[] args) {
		BankAccount bank=new BankAccount();
		ThreadWith th1=new ThreadWith(bank);
		ThreadDep th2=new ThreadDep(bank);

		th1.start();
		((Thread) th2).start();
	}

}
	


