package com.bharadwaj.SLT.Programs;

import java.util.Scanner;

public class Fibonnoci {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int i,a=1,b=1,c=0;
		
		System.out.print(a);
		
		System.out.print(" "+b);
		
		for(i=0;i<5;i++) 
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
		
		System.out.println();

	}

}
