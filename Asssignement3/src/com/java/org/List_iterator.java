package com.java.org;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class List_iterator {

	public static  void main(String[] args) {
		

		ArrayList<Object> n=new ArrayList<>();
		

		n.add("Hulk");
		n.add("Tom");
		n.add("Jerry");
		n.add("Spidy");
		n.add("Groot");
		n.add("Thor");
		n.add(2);
		
		System.out.println(n);
		
		ListIterator<Object>  l= n.listIterator(n.size());
		
		while(l.hasPrevious())
		{
			Object s=l.previous();
			System.out.println(s);
			
			
			
		}
		

	}

}
