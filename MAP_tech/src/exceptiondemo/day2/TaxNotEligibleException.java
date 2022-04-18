package exceptiondemo.day2;

public class TaxNotEligibleException extends Exception {
	@Override
	public String getMessage()
	{
		return "Tax is not eligible";
	}

}
