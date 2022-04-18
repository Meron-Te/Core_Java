package com.tech.java.day3;

public class PermanentEmployee extends Employee {
	private double salary;
	public PermanentEmployee()
	{
		
	}
	@Override
	public void accept()
	{	super.accept();//calls the accepts method of super class first
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
	}
	@Override
	public void display()
	{
		super.display();//calls the display method of super class first
		System.out.println("Salary is "+salary);
	}
	public void calculateSalary()
	{
		System.out.println("Calculating salary for permanent employee");
	}
	public static void main(String[] args) {
		System.out.println("Accepting employee details");
		Employee emp;
		System.out.println("Want to call for permanent employee");
		emp=new PermanentEmployee();//emp reference variable is initialized to permanent employee
		emp.accept();
		emp.display();
		emp.calculateSalary();
			}
	
}



