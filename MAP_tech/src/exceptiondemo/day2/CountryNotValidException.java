package exceptiondemo.day2;

public class CountryNotValidException extends Exception{
	

	@Override
	
public String getMessage()
	{
		return "Not Indian";
	}

}
