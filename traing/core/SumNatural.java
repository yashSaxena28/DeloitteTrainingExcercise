package com.traing.core;

import java.util.Scanner;

public class SumNatural
{
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<n+1;i++)
		{
			if(i%3==0||i%5==0)
			{
				System.out.println("i= "+i);
				sum+=i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto which sum is to be calculated :");
		int n=sc.nextInt();
		int sum=SumNatural.calculateSum(n);
		System.out.println("Sum: "+sum);
		sc.close();
	}

}
