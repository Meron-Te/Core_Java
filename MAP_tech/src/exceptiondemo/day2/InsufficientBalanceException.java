package exceptiondemo.day2;

public class InsufficientBalanceException extends Exception{
	
@Override
public String getMessage()
{
	return "Amount is greater than the Balance";
}
}
