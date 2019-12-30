package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeSalary
{
	float salary;
	
	EmployeeSalary(float salary)
	{
		this.salary=salary;
	}
	
	public void validateSalary()throws EmployeeException
	{
		if(salary<3000)
		{
			throw new EmployeeException();
		}
		else
		{
			System.out.println("VALID  SALARY");
		}
	}
	
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Salary : ");
		float sal=sc.nextFloat();
		try
		{
			EmployeeSalary es=new EmployeeSalary(sal);
			es.validateSalary();
		}
		catch(EmployeeException ee)
		{
			System.err.println(ee);
			main(args);
		}
		sc.close();
	}
}
