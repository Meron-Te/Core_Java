package exceptiondemo.day2;
import java.util.*;
public class BankAccount {
	double balance=50000;
	double amount;
	Scanner sc;
	public BankAccount()
	{
		sc=new Scanner(System.in);
		
	}
	public void withdraw() throws InsufficientBalanceException
	{
		System.out.println("Enter the amount to be withdrawn");
		amount=sc.nextDouble();
	
		if(amount>balance)
		{
			throw new InsufficientBalanceException();
		}
		
	}
	public static void main(String[] args) {
		BankAccount banks = new BankAccount();
		try 
		{
		banks.withdraw();
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
