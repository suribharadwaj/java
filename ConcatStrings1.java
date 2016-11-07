package com.bharadwaj.example.maps;

public class ConcatStrings1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str="hi   this is    java";
		
		String[] str1 = str.split(" ");
		
		for(int i =0;i<str1.length;i++)
		{
			System.out.print(str1[i]);
		}

	}

}
