package com.javaassign;
import java.util.Scanner;
public class AvrerageCalculation {

	public static void main(String[] args) {
		
		System.out.println("Enter mark of Subject A");
		Scanner scanner1=new Scanner(System.in);
		System.out.println("Enter mark of Subject B");
		Scanner scanner2=new Scanner(System.in);
		System.out.println("Enter mark of Subject C");
		Scanner scanner3=new Scanner(System.in);
		double subA=scanner1.nextDouble();
		double subB=scanner2.nextDouble();
		double subC=scanner3.nextDouble();
		double total=subA+subB+subC;
		double avg=total/3;
		System.out.println("The avarage mark is "+avg);
		scanner1.close();
		scanner2.close();
		scanner3.close();
	}

}
