package com.bharadwaj.example.maps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files2 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		// TODO Auto-generated method stub
      File file = new File("sample.txt");
      
      Scanner scanner = new Scanner(new FileInputStream(file));
      
      int count =0;
      
      while(scanner.hasNext())
      {
    	  scanner.next();
    	  count++;
      }
      System.out.println(count);
	}

}
