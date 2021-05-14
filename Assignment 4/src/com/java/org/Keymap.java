package com.java.org;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Keymap {

	public static void main(String[] args) {
		
		HashMap<String,String> m=new HashMap<>();
		StringBuilder p=new StringBuilder();
		
		 m.put("Odisha", "Bhubaneswar");
		 m.put("Karnataka", "Bangalore");
		 m.put("Rajasthan", "Jaipur");
		 m.put("WestBengal", "Kolkata")
		 
		 
		 
		 Set s1=m.entrySet();
		 System.out.println(s1);
		 
         Iterator n=s1.iterator();
         while(n.hasNext())
         {
        	 Map.Entry m1 =(Map.Entry)n.next();
             String x=(String) m1.getKey()+m1.getValue();
        	 p.append(x);

         }
         
         System.out.println(p);
	}

}
