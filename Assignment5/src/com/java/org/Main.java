package com.java.org;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {

	public static void main(String[] args) {
		List<Fruit> fru = Arrays.asList(

				new Fruit("Apple", 98, 45, "Red"), new Fruit("Banana", 102, 30, "Yellow"),
				new Fruit("Strwabeery", 120, 55, "Red"), new Fruit("Blackberry", 78, 34, "Black"));

		List<News> news1 = Arrays.asList(

				new News(22, "Navin", "Asha", " the new budget lis is good"),
				new News(23, "Venky", "naga", "Finally ipl Started"),
				new News(23, "Venky", "Naga", "I supported to MI "), new News(24, "Ashish", "Narhsa", "wbu 12 exam"),
				new News(22, "Navin", "Yallesh", "without budget list face too much problem"),
				new News(23, "Venky", "Naga", "ipl india ka festival"));
		List<Trader> Trade = Arrays.asList(

				new Trader("Chichya", "Pune"), new Trader("Chintu", "Mumbai"), new Trader("Amol", "Pune"),
				new Trader("Akash", "Delhi"), new Trader("Rohan", "Delhi"), new Trader("Sagar", "Pune"));
		List<Transaction> Tran = Arrays.asList(

				new Transaction(new Trader("Chichya", "Pune"), 2014, 20000),
				new Transaction(new Trader("Chintu", "Mumbai"), 2012, 21000),
				new Transaction(new Trader("Akash", "Delhi"), 2019, 70000),
				new Transaction(new Trader("Amol", "Pune"), 2017, 22222),
				new Transaction(new Trader("Rohan", "Delhi"), 2014, 19999),
				new Transaction(new Trader("Sagar", "Pune"), 2015, 17000));

		// Q1) Displayed the fruit names of low calories fruits i.e. calories < 100
		// sorted in
		// descending order of calories.
		System.out.println("Acoording to <less calories ");
		fru.stream().filter(t -> (t.FruitCalories < 100)).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));

		// Display color wise list of fruit names
		System.out.println("\nSort according to color");
		fru.stream().sorted((p1, p2) -> p1.FruitColor.compareTo(p2.FruitColor)).forEach(System.out::println);

		// Display only RED color fruits sorted as per their price in ascending order.
		System.out.println("\nSort Red color fruits sorted withprice in ascending");
		fru.stream().filter(t -> t.FruitColor.equals("Red")).forEach(t -> System.out.println(t));

		// Find out the newsId which has received maximum comments.
		System.out.println("\nnewsId which has received maximum comments");
		int p = news1.stream().min((p1, p2) -> {
			return (int) p1.getNewsID() + p2.getNewsID();
		}).get().getNewsID();
		System.out.println(p);

		// Find out how many times the word 'budget' arrived in user comments all news.
		System.out.println("\nthe word 'budget' arrived in user comments ");

		news1.stream().filter(t -> t.NewsComment.contains("budget")).forEach(t -> System.out.println(t));

		// Find out which user has posted maximum comments.
		System.out.println("\nwhich user has posted maximum comments");
		String n = news1.stream().max((p1, p2) -> {
			return (int) p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser());
		}).get().getNewsCommentbyUser();

		System.out.println(n);

		// Display commentByUser wise number of comments
		System.out.println("\ncommentByUser wise number of comments");
		news1.stream().sorted((p1, p2) -> p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser()))
				.collect(Collectors.toList())
				.forEach(t -> System.out.println(t.NewsCommentbyUser + "=" + t.NewsComment));

		// Find all transactions in the year 2011 and sort them by value (small to
		// high).
		System.out.println("\ntransactions in the year 2011 and sort them by value (small to high).");
		Tran.stream().filter(t -> (t.getYear() == (2014)))
				.forEach(t -> System.out.println("year=" + t.year + " value=" + t.value));

		// What are all the unique cities where the traders work?
		System.out.println("\nall the unique cities where the traders work");

		Trade.stream()

				.forEach(t -> System.out.println("Cityies=" + t.TradeCity));

		// Find all traders from Pune and sort them by name.
		System.out.println("\ntraders from Pune and sort them by name");
		Trade.stream().filter(t -> t.TradeCity.equals("Pune"))
				.sorted((p1, p2) -> p1.TraderName.compareTo(p2.TraderName))
				.forEach(t -> System.out.println(t.TradeCity + "=" + t.TraderName));

		// Return a string of all traders’ names sorted alphabetically.
		System.out.println("\nstring of all traders’ names sorted alphabetically");
		Trade.stream().sorted((p1, p2) -> p1.TraderName.compareTo(p2.TraderName))
				.forEach(t -> System.out.println(t.TraderName));

		// Are any traders based in Indore?
		System.out.println("\nany traders based in Indore?");
		boolean a = Trade.stream().anyMatch(t -> t.TraderName.equals("indore"));
		System.out.println(a);

		// Print all transactions’ values from the traders living in Delhi.
		System.out.println("\nall transactions’ values from the traders living in Delhi");

		Tran.stream().filter(t -> t.trader.TradeCity.equals("Delhi"))
				.forEach(t -> System.out.println(t.trader.TradeCity + "=" + t.value));

		// What’s the highest value of all the transactions?
		System.out.println("\nhighest value of all the transactions");

		int b = Tran.stream().max((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(b);
		// Find the transaction with the smallest value
		System.out.println("\ntransaction with the smallest value");
		int s = Tran.stream().min((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(s);

	}

}
