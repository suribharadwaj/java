package com.bharadwaj.SLT.Programs;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values u want to read");
		
	int num	=sc.nextInt();
	
	int n[] = new int[num];
	
	for(int k =0;k<n.length;k++)
	{
		n[k]=sc.nextInt();
	}
		for(int i =0;i<n.length;i++)
		{
			for(int j =i+1;j<n.length;j++)
			{
				if(n[i] == n[j])
				{
					System.out.println(n[j]);
				}
			}
		}

	}

}
