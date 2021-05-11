package com.javaassign;

public class ResultDeclaration {

	public static void main(String[] args) {
		 int subject1=45;
		 int subject2=81;
		 int subject3=75;
		 if (subject1>60&&subject2>60&&subject3>60) {
			 System.out.println("PASSED");
		 }
		 else if (subject1>60||subject2>60||subject3>60) {
			 System.out.println("Promoted");
		 }
		 else {
			 System.out.println("Fail");
		 }
		 
	}

}
