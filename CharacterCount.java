package com.bharadwaj.SLT.Programs;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {

	public static void main(String[] args)
	{
		String str = "Programming";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				int val = map.get(ch);
				map.put(ch, val+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
	System.out.println(map);
	}

}
