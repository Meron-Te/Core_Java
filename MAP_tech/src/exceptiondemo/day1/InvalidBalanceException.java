package exceptiondemo.day1;

public class InvalidBalanceException extends Exception{
	@Override
	
	public String getMessage()
		{
			return "Not right balance ";
		}


}
