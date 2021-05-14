package com.java.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Fail {

	
	public static void main(String[] args) {
		
		HashSet<Object> n=new HashSet();
		
		n.add("Jio");
		n.add("Airtel");
		n.add(25);
		n.add(55);

		Iterator i=n.iterator();
		 while(i.hasNext())
		   {
			   
			   Object a=i.next();
			   n.add("Airtel");
			   System.out.println(a);
			   
			   
			   
		   }
	
}
	}
