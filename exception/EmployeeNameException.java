package com.cg.eis.exception;

public class EmployeeNameException extends Exception
{
	EmployeeNameException(){}
	
	public String toString()
	{
		return "\nYour first name or last name is empty please enter a valid first/last name.";
	}
}
