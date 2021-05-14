package com.java.org;
import java.util.Scanner;

public class Order {


	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Amount");
		
		int price=scanner.nextInt();
		
		if(price>10000)
		{
		 System.out.println(" Order is Accepeted");
		    
		}
		else
		{
			System.out.println("Oder is not accepted");
			
			
			
		}
		
	}
	
	
}

