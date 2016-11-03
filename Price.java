package com.bharadwaj.example.maps;

import java.util.Scanner;

public class Price{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name of the student");
		String name = sc.next();
		int price[] = new int[5];
		float avg, per;
		float sum=0;
		System.out.println("Enter the price of each product");
		for(int i =0;i<5;i++)
		{
			price[i]=sc.nextInt();
			sum = sum+price[i];
		}
		per= (sum/500)*100;
		
		System.out.println(name + " " +per);
		
		float spent = (per/100) * 10000;
		
		System.out.println(spent);

	}

}
