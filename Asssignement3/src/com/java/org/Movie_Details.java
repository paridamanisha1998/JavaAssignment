package com.java.org;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Movie_Details {
	String movieName;
	String HeraPheri;
	String Stree;
	String Kgf;

	public Movie_Details(String movie_Name, String hero, String villain, String genre) {
		super();
		this.movie_Name = movie_Name;
		HeraPheri = herapheri;
		Stree = stree;
		Kgf = kgf;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHeraPheri() {
		return HeraPheri;
	}

	public void setHeraPheri(String heraPheri) {
		HeraPheri = heraPheri;
	}

	public String getStree() {
		return Stree;
	}

	public void setStree(String stree) {
		Stree = stree;
	}

	public String getGetKgf() {
		return Kgf;
	}

	public void setKgf(String kgf) {
		Kgf = kgf;
	}

	@Override
	public String toString() {
		return "Movie_Details [movie_Name=" + movie_Name + ", HeraPheri=" + HeraPheri + ", Stree=" + Stree + ", Kgf="
				+ Kgf + "]";
	}

}

class Movie_dataList {

	public static void main(String[] args) {

		List<Movie_Details> movie = Arrays.asList(new Movie_Details("Master", "Thalaphathy", "Vjs", "Action");
		Collections.sort(movie, new Comparator<Movie_Details>() {

			@Override
			public int compare(Movie_Details o1, Movie_Details o2) {
				return o1.movie_Name.compareTo(o2.movie_Name);

			}

		});

		printallmovie(movie);
		remove_movie(movie, "Mersal");

	}

	private static void printallmovie(List<Movie_Details> movie) {
		for (Movie_Details p : movie)
			System.out.println(p);
	}

	public static void remove_movie(List<Movie_Details> movie, String name) {
		movie.remove(name);
	}

}
