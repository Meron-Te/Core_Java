package exceptiondemo.day2;

public class EmployeeNameInvalidException extends Exception {
@Override
	public String getMessage() {
		return "Empty name";
	}

}
