package com.java.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Show {

	public static void main(String[] args) {
		ArrayList<Integer> T = new ArrayList<Integer>();
		T.add(4);
		T.add(43);
		T.add(16);
		T.add(50);
		T.add(90);
		T.add(30);
		Thread n = new Thread(new Runnable() {
			@Override
			public void run() {
				
				T.stream().forEach(t -> System.out.println(t));
			}
		});
		n.run();
	}
}