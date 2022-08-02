package com.bridgelabz.PracticeAssignment;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		/*
		 *		printing even numbers
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number : ");
		int first = scan.nextInt();
		
		System.out.print("Enter last number : ");
		int last = scan.nextInt();
		
		System.out.println("\nEven numbers between "+first +" & " +last);
		for (int i = first; i <= last; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
scan.close();
	}
}