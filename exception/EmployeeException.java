package com.cg.eis.exception;

public class EmployeeException extends Exception
{
 EmployeeException(){}
 
 public String toString()
 {
	 return "\nSalary is less than 3000.";
 }
}
