package com.traing.core;

import java.util.Scanner;

public class CheckPower
{

	public static boolean checkNumber(int n)
	{
		int binVal=Integer.parseInt(Integer.toBinaryString(n).substring(1));
		if(binVal==0)
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		if(CheckPower.checkNumber(num))
			System.out.println(num+" is power of 2");
		else
			System.out.println(num+" is not power of 2");
		sc.close();
	}

}
