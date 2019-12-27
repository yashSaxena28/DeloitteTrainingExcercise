package com.traing.core;

import java.util.Scanner;

public class SquareArithematics
{
	public static int calculateDifference(int n)
	{
		int sum=0,sumSq=0,diff;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			sumSq+=(i*i);
		}
		sum*=sum;
		diff=sumSq-sum;
		return diff;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N-th number: ");
		int n=sc.nextInt();
		int diff=SquareArithematics.calculateDifference(n);
		System.out.println("Difference is squares: "+diff);
		sc.close();
	}

}
