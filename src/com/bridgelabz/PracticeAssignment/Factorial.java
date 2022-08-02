package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		/*
		 *		calculating factorial of number
		 */
		
		int factorial = 1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		
		for (int i = 2; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " = " + factorial);
		
scan.close();
	}
}