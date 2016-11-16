package com.bharadwaj.SLT.Programs;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		
		int sum=0;
		
		int input = num;
		
		while(input!=0)
		{
			int lastdigit = input%10;
			sum = sum+lastdigit;
			input = input/10;
		}
		
		if(sum ==1 || ((sum/10)==1 && (sum%10)==0))
		{
			System.out.println("Magic Number");
		}
		else
		{
			System.out.println("The Given number is not a Magic Number");
		}
	
	}

}
