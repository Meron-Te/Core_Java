package exceptionHandling;

public class CountryNotValidException extends Exception{
@Override
	public String getMessage() {
		return "Country Not Indian";
	}

}
