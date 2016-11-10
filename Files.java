package com.bharadwaj.example.maps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
		
		int lines =0;
		
		while(reader.readLine() != null)
		{
			lines++;
		}
		System.out.println(lines);
		reader.close();

	}

}
