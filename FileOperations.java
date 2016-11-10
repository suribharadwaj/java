package com.bharadwaj.example.maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperations {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		byte cusId;
		String cusName = null;
		int cusAge;
		float cusSal;
		char grade;
		
		try
		{
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			
			System.out.println("Enter customer ID");
			cusId = Byte.valueOf(br.readLine());
			String s3 = String.valueOf(cusId);
			s3 = s3.concat(",");
			
			System.out.println("Enter customer Name");
			cusName = br.readLine();
			cusName = cusName.concat(",");
			
			System.out.println("enter age");
			cusAge = Integer.parseInt(br.readLine());
			String s = String.valueOf(cusAge);
			s=s.concat(",");
			
			System.out.println("Enter Salary");
			cusSal = Float.parseFloat(br.readLine());
			String s1 = String.valueOf(cusSal);
			s1 = s1.concat(",");
			
			System.out.println("Enter Grade");
			grade = (char)br.read();
			String s2 = String.valueOf(grade);
						
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");

        fileOutputStream.write(s.getBytes());
        System.out.println(" ");
        fileOutputStream.write(cusName.getBytes());
        System.out.println(" ");
        fileOutputStream.write(s1.getBytes());
        System.out.println(" ");
        fileOutputStream.write(s2.getBytes());
        System.out.println(" ");
        fileOutputStream.write(s3.getBytes());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		System.out.println(" ");
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		String curLine;
		while ((curLine = br.readLine()) != null) 
		{
			System.out.println(curLine);
			
			String[] word = curLine.split(",");
			System.out.println(word[0]+" "+word[1]);
		}
		
	}

}
