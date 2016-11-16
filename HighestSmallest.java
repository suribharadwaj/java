package com.bharadwaj.SLT.Programs;

import java.util.Scanner;

public class HighestSmallest {

	public static void main(String[] args) 
	{
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter how many values you want to enter");
		  
		  int num = sc.nextInt();
		  
		  int numbers[] = new int[num];
		  
		  for(int k =0;k<numbers.length;k++)
			{
				numbers[k]=sc.nextInt();
			}
		  
		  
          int smallest = numbers[0];
          int largest = numbers[0];
         
          for(int i=1; i< numbers.length; i++)
          {
                  if(numbers[i] > largest)
                	  
                          largest = numbers[i];
                  
                  else if (numbers[i] < smallest)
                          smallest = numbers[i];
                 
          }
         
          System.out.println("Largest Number is : " + largest);
          
          System.out.println("Smallest Number is : " + smallest);

	}

}
