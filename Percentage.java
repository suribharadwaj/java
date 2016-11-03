package com.bharadwaj.example.maps;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the student");
		String name = sc.next();
		System.out.println("enter the number if subjects");
		int subject = sc.nextInt();
		int marks[] = new int[subject];
		float avg, per;
		float sum=0;
		System.out.println("Enter the marks");
		for(int i =0;i<subject;i++)
		{
			int num= sc.nextInt();
	    	if(num<=0)
	    	{
	    		System.out.println("Enter greater than zero");
	    		i--;
	    	}
	    	else
	    	{
	    		marks[i]=num;
				sum = sum+marks[i];
				
	    	}
	    	
		}
		avg = (sum/subject);
		per= (sum/(subject*100))*100;
		
		System.out.println(name + " " +per + " "+avg);
		
		if(per>=85 && per<=99)
		{
			System.out.println("He got A grade");
		}
		else if (per>=75  && per<=84) 
		{
			System.out.println("He got B grade");
		}
		else if (per>=65 && per<=74) 
		{
			System.out.println("He got C grade");

		}
		else if (per>=50 && per<=64) 
		{
			System.out.println("He got D grade");
		} 
		else {
			System.out.println("Fail");
			
		}
		
	}
	}
