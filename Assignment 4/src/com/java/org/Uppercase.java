package com.java.org;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Uppercase {

	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();

		n.add("Chicken");
		n.add("Mutton");
		n.add("Fish");
		n.add("Kabab");
		n.add("Prawn");
		n.replaceAll(t -> t.toUpperCase());

		System.out.println(n);

	}

}
