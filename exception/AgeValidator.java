package com.cg.eis.exception;

import java.util.Scanner;

public class AgeValidator 
{
	int age;
	
	AgeValidator(int age)
	{
		this.age=age;
	}
	
	public void validate() throws AgeException
	{
		if(age>15)
		{
			System.out.println("VALID AGE");
		}
		else
		{
			throw new AgeException();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age=sc.nextInt();
		try{
		AgeValidator av=new AgeValidator(age);
		av.validate();
		}
		catch(AgeException ae)
		{
			System.err.println(ae);
			main(args);
		}
		sc.close();
	}

}
