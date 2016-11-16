package com.bharadwaj.SLT.Programs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) 
	{

		long temp=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number");
		long n=scr.nextLong();
	
		for(int i=1;i<n;i++)
		{
			if((n%i)==0)
			{
				System.out.println(i);
				temp=temp+i;
			}
		}	
		
		if(temp ==  n)
		{
			System.out.println("The number is a perfect number");
		}
	}

}
