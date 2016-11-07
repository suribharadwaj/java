package com.bharadwaj.example.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConcatStrings {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] s1 ={"a1","a2","a3"};
		String[] s2 ={"b1","b2","b3"};
		
		List<String> list = new ArrayList<String>(Arrays.asList(s1));
		
		list.addAll(Arrays.asList(s2));
		//Object [] c = list.toArray();

	//	System.out.println(Arrays.toString(c));
		// String [] c = (String[]) list.toArray();
		
		String c =list.toString();
		 
		// System.out.println(Arrays.toString(c));
		System.out.println(c);
	}
}
