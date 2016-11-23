package com.bharadwaj.SLT.Programs;

import java.util.*;

public class RemoveFirstLast {

	public static void main(String[] args)
	{
		LinkedList<String> linkedlist = new LinkedList<String>();
		 
	    // Add elements to LinkedList
	    linkedlist.add("Item1");
	    linkedlist.add("Item2");
	    linkedlist.add("Item3");
	    linkedlist.add("Item4");
	    linkedlist.add("Item5");
	 
	    // Displaying Elements before remove
	    System.out.println("LinkedList Elements are:");
	    for(String str: linkedlist){
	       System.out.println(str);
	    }
	 
	    // Removing First element
	    Object firstElement = linkedlist.removeFirst();
	    
	    System.out.println("\nElement removed: "+ firstElement);
	 
	    // Removing last Element
	    Object lastElement = linkedlist.removeLast();
	    
	    System.out.println("Element removed: "+ lastElement);
	 
	    // LinkedList elements after remove
	    System.out.println("\nList Elements after Remove:");
	    for(String str2: linkedlist){
	       System.out.println(str2);
	    }

	}

}
