package com.java.org;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashLink {

	public static void main(String[] args) {
		
       
		HashSet<String> n=new HashSet<>();
		n.add("Hulk");
		n.add("Tom");
		n.add("Jerry");
		n.add("Spidy");
		n.add("Groot");
		n.add("Thor");
		
		System.out.println("Unorderd "+n);
		
		LinkedHashSet<String> ln=new LinkedHashSet<String>();
		ln.add("Hulk");
		ln.add("Tom");
		ln.add("Jerry");
		ln.add("Spidy");
		ln.add("Groot");
		ln.add("Thor");
		
		System.out.println("Orderd "+ln);
		
		
		
	}

}
