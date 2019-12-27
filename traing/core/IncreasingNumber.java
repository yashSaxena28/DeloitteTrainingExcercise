package com.traing.core;

import java.util.Scanner;

public class IncreasingNumber 
{
	public static boolean checkNumber(int number)
	{
		int left=0,right=0;
		boolean check=false;
		while(number>9)
		{
			right=number%10;
			number/=10;
			left=number%10;
			check=left<=right;
			if(!check)
				return check;
		}
		return check;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to check for Increasing Number : ");
		int number=sc.nextInt();
		boolean check_result=IncreasingNumber.checkNumber(number);
		if(check_result)
			System.out.println(number+" is an increasing number");
		else
			System.out.println(number+" is not an increasing number");
		sc.close();
	}

}
