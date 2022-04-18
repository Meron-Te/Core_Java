package exceptionHandling;

public class TaxCalculator {
	private double salary;
	private boolean isIndian;
	public String empname;
	public void calculateTax(double salary,boolean isIndian,String empname)
			throws CountryNotValidException
	{
		this.salary=salary;
		this.isIndian=isIndian;
		this.empname=empname;
		if(!isIndian)
		{
			throw new CountryNotValidException();
		}
		if(empname == null)	
		{
			throw new EmployeeNameInvalidException();
		}
		
		if(salary>100000 & isIndian == true)
		{
			System.out.println("tax amount is" +salary*8/100);
		}
		else if(salary >= 50000 && salary >= 100000 & isIndian==true)
		{
			System.out.println("tax amount is" +salary*6/100);
		}
		else if(salary >= 30000 && salary>=50000 & isIndian==true)
		{
			System.out.println("tax amount is" +salary*5/100);
		}
		else if(salary >= 10000 && salary>=30000 & isIndian==true)
		{
			System.out.println("tax amount is" +salary*4/100);
		}
		else 
		{
			throw new 
		}
			
		
	}
	public static void main(String[] args) {
		TaxCalculator tax1=new TaxCalculator();
		try {
			tax1.calculateTax(50000, false, "Andy");
		} catch (CountryNotValidException e) {
		
			System.out.println("Exception is" +e.getMessage());
			e.printStackTrace();
		}
		try {
			tax1.calculateTax(50000, false, "Andy");
		} catch (CountryNotValidException e) {
		
			System.out.println("Exception is" +e.getMessage());
			e.printStackTrace();
		}
		try {
			tax1.calculateTax(50000, false, "Andy");
		} catch (CountryNotValidException e) {
		
			System.out.println("Exception is" +e.getMessage());
			e.printStackTrace();
		}
		
	}
}


