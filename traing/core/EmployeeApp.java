package com.traing.core;

import java.util.Arrays;

public class EmployeeApp
{

	public static void main(String[] args) 
	{
		Employee []emp=new Employee[10];
		emp[0]=new Employee(1,"Yash","CEO");
		emp[1]=new Employee(2,"Pratik","CMO");
		emp[2]=new Employee(3,"Akash","COO");
		emp[3]=new Employee(4,"Pratham","CA");
		emp[4]=new Employee(5,"Iqbal","Manager");
		emp[5]=new Employee(6,"Bhakti","HR");
		emp[6]=new Employee(7,"Abdul","AA");
		emp[7]=new Employee(8,"Ankit","BTA");
		emp[8]=new Employee(9,"Anisha","MD");
		emp[9]=new Employee(10,"Vedant","TnA");
		
		Arrays.sort(emp);
		
		for(Employee value: emp)
		{
			System.out.println(value);
		}
	}

}
