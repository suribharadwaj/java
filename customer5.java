package com.bharadwaj.example.maps;

import java.util.Scanner;

public class customer5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer names ");
		int j;
		String name[] = new String[10];
		for(j=0;j<10;j++)
		{
			name[j]=sc.next();
		}
		//System.out.println(name[j]);

		int rating[] = new int[10];
		float avg;
		float sum=0;
		System.out.println("Enter the rating");
		for(int i =0;i<10;i++)
		{
			rating[i]=sc.nextInt();
			sum = sum+rating[i];
		}
		avg = sum/10;		
		System.out.println(avg);
	}

}
