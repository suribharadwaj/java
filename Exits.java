package com.bharadwaj.SLT.Programs;

import java.util.*;

public class Exits {

	public static void main(String[] args) 
	{
		 LinkedList lList = new LinkedList();
		   
		    //add elements to LinkedList
		    lList.add("1");
		    lList.add("2");
		    lList.add("3");
		    lList.add("4");
		    lList.add("5");
		   
		   
		     boolean blnElement = lList.contains("4");
		   
		     if(blnElement)
		     {
		       System.out.println("LinkedList contains 4");
		     }
		     else
		     {
		       System.out.println("LinkedList does not contain 4");
		     }

	}

}
