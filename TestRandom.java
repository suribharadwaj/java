package com.bharadwaj.SLT.Programs;

import java.util.Random;
import java.util.Random.*;
import java.math.*;

public class TestRandom {

	public static void main(String[] args)
	{
		int counter;
		
	      Random rnum = new Random();
	      
	 //     Below code would generate 5 random numbers  between 0 and 200.
	      
	      System.out.println("Random Numbers:");
	      
	      // Starts the random number
	      for (counter = 1; counter <= 5; counter++) 
	      {
	         System.out.println(rnum.nextInt(200));
	      }

	}

}
