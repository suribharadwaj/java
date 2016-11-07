package com.bharadwaj.example.maps;

public class SplitStrings {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "This_ is_ a_ string";
	
		String[] str = s.split("_");

		for(int i =0;i<str.length;i++)
		{
			System.out.print(str[i]);
		}
		
		}

	}


