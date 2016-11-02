package com.bharadwaj.example.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap = new HashMap<Integer, String>();
		
		hmap.put(1,"Bharadwaj");
		hmap.put(2, "suri");
		hmap.put(3,"naga");
		hmap.put(4, "venkata");
	   
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println(mentry.getKey());
			System.out.println(mentry.getValue());
			System.out.println(mentry.hashCode());
			System.out.println(mentry.equals(iterator));
			System.out.println(mentry.setValue(iterator));
			
			
			
			
			
		}
		
		
         
		

	}

}
